package Searching.Binary;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] a = {98, 87, 56, 42, 40, 36, 31, 8, 5, 3};
        int ans = orderAgnosticBS(a, 56);
        System.out.println(ans);
    }

    private static int orderAgnosticBS(int[] a, int target) {
        int start = 0, end = a.length - 1;

        //find whether the array is sorted in ascending or descending
        //by comparing the first and last elements

        boolean isAsc = a[start] < a[end];

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2  might be possible that (start + end) extends the range of int in java
            int mid = start + (end - start) / 2;

            if (a[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < a[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > a[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        // answer not found
        return -1;
    }
}
