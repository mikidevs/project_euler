(defn sqrt [n] (long (Math/floor (Math/sqrt n))))

(defn factor [n]
  (loop [acc '() number n]
    (let [divisor (or (some #(when (= 0 (mod number %)) %) (range 3 (sqrt number) 2)) number)]
      (if (= divisor number) 
        (conj acc divisor)
        (recur (conj acc divisor) (/ number divisor))))))

(defn largest-factor [n] (reduce max (factor n)))

(largest-factor 600851475143)