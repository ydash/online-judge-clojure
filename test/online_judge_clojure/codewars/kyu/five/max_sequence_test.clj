(ns online-judge-clojure.codewars.kyu.five.max-sequence-test
  (:require
   [clojure.test :refer :all]
   [online-judge-clojure.codewars.kyu.five.max-sequence :refer [max-sequence]]))

(deftest max-sequence-test
  (are [xs expected] (= (max-sequence xs) expected)
    [-2 1 -3 4 -1 2 1 -5 4] 6
    [-1 -2 -3 -2 -1] 0
    [] 0))
