package Searching.Linear;

public class MaxWealth {
    private int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] ints : accounts) {
            //when you start a new row take a new sum for that person
            int rowSum = 0;
            for (int anInt : ints) {
                rowSum += anInt;
            }

            //check of the last persons balance was the max so far
            if (rowSum > max) {
                max = rowSum;
            }
        }

        return max;
    }
}
