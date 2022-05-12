(ns online-judge-clojure.codewars.kyu.six.difftwo-test
  (:require [clojure.test :refer :all]
            [online-judge-clojure.codewars.kyu.six.difftwo :refer [twos-difference]]))

(deftest test-of-twos-difference
  (are [lst expected] (= (twos-difference lst) expected)
    [1 2 3 4] [[1 3] [2 4]]
    [4 1 2 3] [[1 3] [2 4]]
    [1 23 3 4 7] [[1 3]]
    [] []
    [1 4 7 10] []
    [6 3 4 1 5] [[1 3] [3 5] [4 6]]))
