package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class InterLeavingQueues {
    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.offer(7);
        q.offer(8);
        q.offer(9);
        q.offer(10);

        if ((q.size() ^ 1) == q.size() - 1) { // xor of a number with 1 decrements it by 1 if its odd, else increments it if even
            System.out.println("Queue size is odd, cannot implement operation");
            return;
        }

        Stack<Integer> s = new Stack<>();

        int halfSize = q.size() >> 1; // div by 2

        for (int i = 0; i < halfSize; i++) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        for (int i = 0; i < halfSize; i++) {
            q.add(q.remove());
        }
        for (int i = 0; i < halfSize; i++) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
