(defn nxt-indx
	[v i val]
	(first 
		(for [j (range (inc i) (count v))
			:when (== (v j) val)] j)))

(defn assoc-nth
	[v i n val]
	(reduce #(assoc %1 %1 val) v (range (+ i n)
		(count v) n)))

(defn sieve [n]
	(let [limit (int (Math/sqrt n))]
		(loop [i 2, s (into [1 1] (repeat (- n 2) 0))]
			(if (> limit)
				s
				(let [s_ (assoc-nth s i i 1)]
					(recur (nxt-indx s_ i 0) s_))))))

(defn indxs
	[v val]
	(for [i (range (count v))
		:when (== (v i)
			val)] i))

(defn primes [n]
	(indxs (sieve n) 0))