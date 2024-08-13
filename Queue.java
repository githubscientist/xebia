public class Queue {
    int size;
    int items[];
    int front;
    int rear;

    Queue(int size) {
        this.size = size;
        this.items = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull() {
        return this.rear + 1 == this.size;
    }

    public boolean isEmpty() {
        return this.front == this.rear;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        this.rear++;
        this.items[this.rear] = item;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        this.front++;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return this.items[this.front];
    }
}
