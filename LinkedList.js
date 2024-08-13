class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
    }

    insertHead(data) {
        // create a new node
        let newNode = new Node(data);   

        // check if the list is empty
        if(this.head === null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    insertTail(data) {
        // create a new node
        let newNode = new Node(data);

        // check if the list is empty
        if(this.head === null) {
            this.head = newNode;
        } else {
            // create a pointer to traverse the list
            let current = this.head;

            // traverse the list to get to the end
            while(current.next !== null) {
                current = current.next;
            }

            // set the last node's next to the new node
            current.next = newNode;
        }
    }

    deleteHead() {
        if(this.head === null) {
            return;
        }

        this.head = this.head.next;
    }

    deleteTail() {
        if(this.head === null) {
            return;
        }   

        let current = this.head;

        while(current.next.next !== null) {
            current = current.next;
        }

        current.next = null;
    }

    toArray() {
        let current = this.head;
        let arr = [];

        while(current !== null) {
            arr.push(current.data);
            current = current.next;
        }

        return arr;
    }
}

let list = new LinkedList();

list.insertHead(10);
list.insertHead(12);
list.insertHead(14);
list.insertTail(8);
list.insertTail(6);

list.deleteHead();
list.deleteTail();

console.log(list.toArray());

/*
    list = LinkedList { 
        head: Node {
            data: 12,
            next: Node {
                data: 10,
                next: null
            }
        } 
    }
    
    newNode = Node {
        data: 12,
        next: Node {
            data: 10,
            next: null
        }
    }
*/