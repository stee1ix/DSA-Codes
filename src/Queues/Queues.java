package Queues;

public class Queues {
    int cap, size, front, rear, a[];

    Queues(int cap) {
        this.cap = cap;
        this.size = 0;
        this.front = this.rear = -1;
        this.a = new int[cap];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.cap;
    }

    public void enQueue(int ele) {
        if (isFull()) {
            System.out.println("Queue overflow");
        } else {
            rear = (rear + 1) % cap;
            a[rear] = ele;
            if (front == -1) {
                front = rear;
            }
            size += 1;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
        }
        if (front == rear) {
            front = rear = -1;
            size = 0;
        } else {
            front = (front + 1) % cap;
            size -= 1;
        }
    }

    public static void main(String[] args) {
        Queues q = new Queues(5);

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        for (int i = 0; i < q.size; i++) {
            System.out.println(q.a[i]);
        }

    }
}
