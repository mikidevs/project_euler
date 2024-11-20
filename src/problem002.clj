(defn fib [a b]
  (map first 
    (iterate (fn [[x y]] [y (+ x y)]) [a b])))

(defn even-fib [num]
  (reduce + 0 
    (take-while #(< % num)
                (filter even? (fib 1 2)))))

(println (even-fib 4000000))