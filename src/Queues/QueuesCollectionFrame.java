package Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueuesCollectionFrame {
    public static void main(String[] args) {
//        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(15);
        q.offer(18);
        q.offer(5);

        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.element());
        System.out.println(q.remove());
        System.out.println(q.add(10));
        System.out.println(q);
    }
}

/*
 *  Use ArrayDeque for array implementation and LinkedList for linkedList implementation

 *  Difference between functions->
 *  peek, poll, offer returns special value, poll() returns null if queue is empty.
 *  add, remove, element throws exception
 * */
