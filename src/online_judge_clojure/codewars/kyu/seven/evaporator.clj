(ns online-judge-clojure.codewars.kyu.seven.evaporator)

(defn evaporator [_ evap_per_day threshold]
  (loop [rest 100.
         day 0]
    (if (<= rest threshold)
      day
      (recur (- rest (* rest (/ evap_per_day 100))) (inc day))))
  )
