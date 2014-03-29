(int
	(- (Math/pow
		(/ (* 100 101) 2) 2)
	(reduce + (for [i (range 101)]
		(* i i)))))