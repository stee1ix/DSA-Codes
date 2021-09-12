package Searching.Linear;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12, 19, 5}
        };
        int target = 3;
        int[] ans = search(arr, target); //format of return value {row, column}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    private static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }

        return new int[]{-1, -1};
    }

    //find max in the 2D array
    private static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int ele : ints) {
                if (ele > max) {
                    max = ele;
                }
            }
        }
        return max;
    }
}
