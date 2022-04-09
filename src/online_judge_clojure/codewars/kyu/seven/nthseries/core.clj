(ns online-judge-clojure.codewars.kyu.seven.nthseries.core)

(defn series-sum [n]
  (->> (range 1 (+ (* 3 n) 1) 3)
       (map #(float (/ %)))
       (take n)
       (cons 0.)
       (apply +)
       (format "%.2f"))
  )
