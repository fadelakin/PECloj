; Fisher
; Project Euler Problem 3
; when running in repl, run with argument
; ex: "user => (p 600851475143)"

(defn p 
	[value]
	(loop [x value, fac 2]
		(if (= x 1)
			fac
			(let [divisible? (zero? (rem x fac))
				new-x (if divisible? (/ x fac) x)
				new-fac (if divisivle? fac(inc fac))]
				(recur new-x new-fac)))))