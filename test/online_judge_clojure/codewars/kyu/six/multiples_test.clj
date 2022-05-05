(ns online-judge-clojure.codewars.kyu.six.multiples-test
  (:require [clojure.test :refer :all]
            [online-judge-clojure.codewars.kyu.six.multiples :refer [solution]]))

(deftest test-of-multiples
  (are [number expected] (= (solution number) expected)
    10 23
    0 0
    20 78))
