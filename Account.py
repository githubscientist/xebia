class A:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def sum(self):
        return self.a + self.b


class B(A):
    def __init__(self, a, b, c):
        # call the parent class constructor
        super().__init__(a, b)
        self.c = c

    # method overriding
    def sum(self):
        return self.a + self.b + self.c


obj = B(1, 2, 3)

print(obj.a, obj.b, obj.c)
print(obj.sum())
