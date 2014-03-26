; Fisher Adelakin
; Project Euler Problem 4

(apply max (filter #(= (str %) (apply str (reverse (str %))))
	(for [x (range 100 1000) y (range 100 x)] (* x y))))