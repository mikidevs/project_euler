(defn divisible-by-3-or-5? [num]
    (or (= 0 (mod num 3)) (= 0 (mod num 5))))

(defn sum [num] 
  (reduce
   (fn [acc x] (if (divisible-by-3-or-5? x) (+ acc x) acc))
   0
   (range 1 num)))

(println (sum 1000))