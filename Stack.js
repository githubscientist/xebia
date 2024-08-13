class Stack {
    constructor() {
        this.items = [];
        this.top = -1;
    }

    push(data) {
        this.items.push(data);
        this.top++;
    }

    pop() {
        if (this.top === -1) {
            return "Stack is empty";
        }
        this.items.pop();
        this.top--;
    }

    isEmpty() {
        return this.top === -1;
    }

    peek() {
        if (this.isEmpty()) {
            return "Stack is empty";
        }
        return this.items[this.top];
    }
}

const stack = new Stack();

stack.push(1);
stack.push(2);

console.log(stack);