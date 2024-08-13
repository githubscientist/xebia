import java.util.Arrays;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    LinkedList() {
        this.head = null;
    }

    public int findLength() {
        Node current = this.head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public String toString() {
        int length = this.findLength();
        int[] nodes = new int[length];
        Node current = this.head;
        for (int i = 0; i < length; i++) {
            nodes[i] = current.data;
            current = current.next;
        }
        return Arrays.toString(nodes);
    }

    public void insertHead(int data) {

        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public void insertTail(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteHead() {
        if (this.head == null) {
            return;
        } else {
            this.head = this.head.next;
        }
    }

    public void deleteTail() {
        if (this.head == null) {
            return;
        } else if (this.head.next == null) {
            this.head = null;
        } else {
            Node current = this.head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertHead(10);
        list.insertHead(20);
        list.insertHead(12);

        list.insertTail(30);
        list.insertTail(40);

        list.deleteHead();

        list.deleteTail();

        System.out.println(list);
    }
}
