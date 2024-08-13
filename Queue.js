class Queue {
    constructor() {
        this.items = [];
        this.front = -1;
        this.rear = -1;
    }

    enqueue(data) {
        // check if the queue is empty
        if (this.front === -1) {
            // the queue is empty
            this.front++; 
        }
        // add data to the queue
        this.items.push(data);
        this.rear++;
    }

    dequeue(data) {
        // check if the queue is empty
        if (this.front === -1) {
            // the queue is empty
            return "Queue is empty";
        }
        // remove data from the queue
        this.items.shift();
    }

    front() {
        // check if the queue is empty
        if (this.front === -1) {
            // the queue is empty
            return "Queue is empty";
        }
        // return the front element
        return this.items[this.front];
    }

    isEmpty() {
        // check if the queue is empty
        if (this.front === -1) {
            // the queue is empty
            return true;
        }
        return false;
    }
}