(defn prob9
	([] (prob9 1000))
	([sum]
		(for [a (range 1 sum)
			b (range a sum)
			c [(- sum a b)]
			:when (= (+ (* a a) (* b b)) (* c c))]
			(* a b c))))

(prob9 1000)