(defn is-prime? [n]
	(cond
		(< n 2) false
		(< n 4) true
		:else (not= 0 (reduce *' (map #(mod n %) (range 2 (+ 1 (Math/sqrt n))))))))