class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def __str__(self):
        current = self.head
        nodes = []

        while current:
            nodes.append(current.data)
            current = current.next

        return str(nodes)

    def insertHead(self, data):
        newNode = Node(data)

        if self.head == None:
            self.head = newNode
        else:
            newNode.next = self.head
            self.head = newNode

    def insertTail(self, data):
        newNode = Node(data)

        if self.head == None:
            self.head = newNode
        else:
            current = self.head

            while current.next:
                current = current.next

            current.next = newNode

    def deleteHead(self):
        if self.head == None:
            return None
        else:
            self.head = self.head.next

    def deleteTail(self):
        if self.head == None:
            return None
        else:
            current = self.head

            while current.next.next:
                current = current.next

            current.next = None


list = LinkedList()

list.insertHead(10)
list.insertHead(12)
list.insertHead(14)
list.insertTail(16)

list.deleteHead()
list.deleteTail()

print(list)
