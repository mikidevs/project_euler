(defn is-palindromic [n] (= n (apply str (reverse n))))

(defn compare-ranges [range1 range2 cond]
  (loop [r1 range1]
    (when (seq r1)
      (let [x (first r1)]
        (if-let [y (some #(when (cond x %) %) range2)]
          [x y]
          (recur (rest r1)))))))

(apply * (compare-ranges (range 999 800 -1) (range 999 800 -1) (fn [a b] (is-palindromic (str (* a b))))))