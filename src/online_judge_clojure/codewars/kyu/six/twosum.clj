(ns online-judge-clojure.codewars.kyu.six.twosum)

(defn twosum [numbers target]
  (reduce-kv
    (fn [acc j n] (if-let [i (acc (- target n))]
                    (reduced [i j])
                    (assoc acc n j)))
    {}
    numbers
    ))
