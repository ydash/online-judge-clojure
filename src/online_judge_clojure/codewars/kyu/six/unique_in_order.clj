(ns online-judge-clojure.codewars.kyu.six.unique-in-order)

(defn unique-in-order [col]
  (reduce #(if (= (peek %1) %2) %1 (conj %1 %2)) [] col))
