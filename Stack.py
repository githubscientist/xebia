class Stack:
    def __init__(self) -> None:
        self.items = []
        self.top = -1

    def push(self, item):
        self.items.append(item)
        self.top += 1

    def pop(self):
        if self.top == -1:
            return None
        self.top -= 1
        return self.items.pop()

    def isEmpty(self):
        return self.top == -1

    def peek(self):
        if self.top == -1:
            return None
        return self.items[self.top]
