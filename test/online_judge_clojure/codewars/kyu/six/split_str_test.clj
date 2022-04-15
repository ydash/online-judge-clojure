(ns online-judge-clojure.codewars.kyu.six.split-str-test
  (:require [clojure.test :refer :all]
            [online-judge-clojure.codewars.kyu.six.split-str :refer :all]))

(deftest test-of-split-str
  (are [s expected] (= (solution s) expected)
                    "abcde" ["ab", "cd", "e_"]
                    "abcdef" ["ab", "cd", "ef"],
                    "a" ["a_"]))
