package Queues;

public class LLQueue {
    private static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node front = null;
    private Node rear = null;
    private int size = 0;

    public boolean isEmpty() {
        return (size == 0);
    }

    public void print() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp!=null) {
                System.out.print("->");
            }
        }
    }

    public void enQueue(int ele) {
        Node temp = new Node(ele, null);

        if (front == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return;
        }

        front = front.next;
        size--;
    }

    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.deQueue();
        q.print();
    }
}

