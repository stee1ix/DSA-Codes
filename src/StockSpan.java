/*
    Span of a stock is the number fof elements on its left with value <= it, including it.
*/

import java.util.Stack;

public class StockSpan {
    static void printSpan(int[] a, int n) { //naive solution O(n^2)
        for (int i = 0; i < n; i++) {
            int span = 1;
            for (int j = i - 1; j >= 0 && a[j] <= a[i]; j--) {
                //traverse reverse from each elem
                // and increment its span till we reach a bigger number
                span++;
            }
            System.out.print(span + " ");
        }
    }

    /*Efficient Solution ->
      span = (Index of the current element) - (Index of the closest greater element of the left side)*/
    static void printSpanEfficiently(int[] a, int n) {
        Stack<Integer> s = new Stack<>();
        s.add(0); //we will be pushing the index in the stack
        System.out.print(1 + " "); // and printing the span

        for (int i = 1; i < n; i++) {
            /*if the last element is smaller then the current element then pop it*/
            while (!s.isEmpty() && a[s.peek()] <= a[i]) {
                s.pop();
            }
            /*if there are not greater elements on the left
            then (index+1)
            else (index- index of greatest on the left)*/
            int span = s.isEmpty() ? i + 1 : i - s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{18, 12, 13, 14, 11, 16};
        printSpanEfficiently(a, a.length);
    }
}
