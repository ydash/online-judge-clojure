(ns online-judge-clojure.codewars.kyu.five.max-sequence)

(defn max-sequence [xs]
  (-> (reduce #(let [[acc maxSum] %1
                     a (max (+ acc %2) %2)]
                 [a (max a maxSum)]) [0 0] xs)
      second))
