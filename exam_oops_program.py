class oops_program:
	def __init__(self):
		self.m = 10
		self.__n = 20
	def output(self):
		return self.__n

obj1 = oops_program()
print(obj1.m)


# answer : program runs fine and gives output as 10
