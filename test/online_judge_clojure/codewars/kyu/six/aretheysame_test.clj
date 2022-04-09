(ns online-judge-clojure.codewars.kyu.six.aretheysame-test
  (:require [clojure.test :refer :all]
            [online-judge-clojure.codewars.kyu.six.aretheysame :refer :all]))

(deftest test-of-compSame
  (are [a b expected] (= (compSame a b) expected)
                      [121, 144, 19, 161, 19, 144, 19, 11] [121, 14641, 20736, 361, 25921, 361, 20736, 361] true
                      [121, 144, 19, 161, 19, 144, 19, 11] [132, 14641, 20736, 361, 25921, 361, 20736, 361] false
                      [121, 144, 19, 161, 19, 144, 19, 11] [121, 14641, 20736, 36100, 25921, 361, 20736, 361] false
                      nil [1] false
                      [1] nil false
                      nil nil false
                      [] [] true
                      ))
