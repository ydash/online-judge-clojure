(ns online-judge-clojure.codewars.kyu.seven.evaporator-test
  (:require [clojure.test :refer :all]
            [online-judge-clojure.codewars.kyu.seven.evaporator :refer :all]))

(deftest test-of-evaporator
  (are [content evap_per_day threshold expected] (= (evaporator content evap_per_day threshold) expected)
                                                 10 10 5 29
                                                 10 10 10 22
                                                 100 1 1 459
                                                 ))
