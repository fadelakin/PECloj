(defn fibs
	[upto]
	(reduce +
		(take-while #(< % upto)
			(take-nth 3
				(map first (iterate (fn [[a b]] [b (+ a b)]) [0 1]))))))

(fibs 4000000)