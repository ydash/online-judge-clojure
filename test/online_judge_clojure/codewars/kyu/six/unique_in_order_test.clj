(ns online-judge-clojure.codewars.kyu.six.unique-in-order-test
  (:require [clojure.test :refer :all]
            [online-judge-clojure.codewars.kyu.six.unique-in-order :refer :all]))

(deftest test-of-unique-in-order
  (are [col expected] (= (unique-in-order col) expected)
                      [1 2 3] [1 2 3]
                      "ABC" [\A \B \C]
                      `(1 2 3) [1 2 3]
                      [0 0 0 0 1 1 1 2 2 0 0 1 1 1] [0 1 2 0 1]
                      "AAAABBBCCDAABBB" [\A \B \C \D \A \B]))
