(ns online-judge-clojure.codewars.kyu.six.multiples)

(defn solution [number]
  (letfn [(sum [a d n]
            (/ (* n (+ (* 2 a) (* (- n 1) d))) 2))]
    (-> (sum 3 3 (quot (- number 1) 3))
        (+ (sum 5 5 (quot (- number 1) 5)))
        (- (sum 15 15 (quot (- number 1) 15))))))
