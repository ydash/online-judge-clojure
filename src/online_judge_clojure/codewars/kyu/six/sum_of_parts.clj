(ns online-judge-clojure.codewars.kyu.six.sum-of-parts)

(defn parts-sums [ls]
  (->> (reverse ls)
       (reduce #(cons (+ (first %1) %2) %1) `(0)))
  )
