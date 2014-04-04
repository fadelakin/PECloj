(defn num-divs [n]
	(let [sqrt-n (int (Math/sqrt n))
		r (range 1 (inc sqrt-n))
		c
		(count (filter #(zero? (rem n %)) r))]
		(if (= n (* sqrt-n sqrt-n)) 
			(- (* 2 c) 1)
			(* 2 c))))

(loop [s 1 n 2]
	(if (> (num-divs s) 500) s
		(recur (+ n s) 
			(inc n))))