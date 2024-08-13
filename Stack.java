public class Stack {
    int top;
    int[] items;

    Stack(int size) {
        top = -1;
        items = new int[size];
    }

    void push(int data) {
        if (top == items.length - 1) {
            System.out.println("Stack is full");
        } else {
            items[++top] = data;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped element: " + items[top--]);
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    int peek() {
        return items[top];
    }
}
