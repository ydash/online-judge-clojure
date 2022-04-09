(ns online-judge-clojure.codewars.kyu.seven.nthseries.core)

(defn series-sum [n]
  (->> (range 1 (+ (* 3 n) 1) 3)
       (map #(/ 1.0 %))
       (apply + 0.)
       (format "%.2f"))
  )
