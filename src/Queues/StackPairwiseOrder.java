package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackPairwiseOrder {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(5);
        s.push(4);
        s.push(-1);
        s.push(0);
        s.push(9);

        Queue<Integer> q = new ArrayDeque<>();
        int pairwiseOrdered = 1;

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            int a = s.pop();
            q.add(a);

            if (!s.isEmpty()) {
                int b = s.pop();
                q.add(b);
                if (Math.abs(a - b) != 1) {
                    pairwiseOrdered = 0;
                }
            }
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        System.out.println(pairwiseOrdered);
    }
}
