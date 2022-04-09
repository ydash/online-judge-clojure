(ns online-judge-clojure.codewars.kyu.seven.nthseries.test
  (:require [clojure.test :refer :all])
  (:require [online-judge-clojure.codewars.kyu.seven.nthseries.core :refer :all]))

(deftest test-of-series-sum
  (are [n expected] (= (series-sum n) expected)
                    9 "1.77"
                    0 "0.00"
                    15 "1.94"))
