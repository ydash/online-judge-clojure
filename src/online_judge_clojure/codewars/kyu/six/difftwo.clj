(ns  online-judge-clojure.codewars.kyu.six.difftwo)

(defn twos-difference [lst]
  (let [nums (set lst)]
    (reduce #(if-let [n (nums (+ %2 2))] (conj %1 [%2 n]) %1) [] (sort lst))))
