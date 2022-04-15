(ns online-judge-clojure.codewars.kyu.six.split-str
  (:require [clojure.string :refer [join]]))

(defn solution [s]
  (->> (partition 2 2 "_" s) (mapv join)))
