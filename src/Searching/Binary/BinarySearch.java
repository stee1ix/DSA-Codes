package Searching.Binary;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 14, 16, 34, 55, 89};
        int ans = binarySearch(arr, 34);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] a, int target) {
        int start = 0, end = a.length - 1;

        while (start <= end) {
            //find the middle element
            // int mid = (start + end) / 2 then it might be possible that (start + end) extends the range of int in java
            int mid = start + (end - start) / 2;
            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                //answer found
                return mid;
            }
        }
        // answer not found
        return -1;
    }
}
