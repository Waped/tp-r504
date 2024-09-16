def puissance(a,b):
	if not type(a) is int:
		raise TypeError("Only integers are allowed")
	elif not type(b) is int:
		raise TypeError("Only integers are allowed")
	elif a < 0 :
		raise TypeError("Use Only positive numbers")
	elif b < 0 :
		raise TypeError("Use Only positive numbers")
	else:
		return a**b
