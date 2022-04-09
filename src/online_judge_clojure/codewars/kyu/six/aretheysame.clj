(ns online-judge-clojure.codewars.kyu.six.aretheysame)

(defn compSame [a b]
  (and (some? a)
       (some? b)
       (= (frequencies (map #(* % %) a)) (frequencies b))))
