(ns online-judge-clojure.codewars.kyu.six.twosum-test
  (:require [clojure.test :refer :all]
            [online-judge-clojure.codewars.kyu.six.twosum :refer :all]))

(deftest test-of-two-sum
  (are [numbers target expected] (= (sort < (twosum numbers target)) expected)
                                 [1 2 3] 4 [0 2]
                                 [1234 5678 9012] 14690 [1 2]
                                 [2 2 3] 4 [0 1]
                                 [-1 1] 0 [0 1]))
