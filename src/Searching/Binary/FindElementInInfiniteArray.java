package Searching.Binary;

/*
 * Find the index of an element in an infinite array
 * */

public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int[] a = {3, 7, 8, 9, 11, 13, 14, 15, 16, 18, 19, 21, 22, 25, 26, 27};
        int target = 15;
        System.out.println(ans(a, target));
    }

    static int ans(int[] a, int target) {
        //first find the range
        //first start with a box of size 2
        int start = 0, end = 1;

        //condition for the target to lie in the range
        while (target > a[end]) {
            int newStart = end + 1;
            //double the chuck size
            //end = prev end + (sizeOfBox * 2)
            end += (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(a, target, start, end);
    }

    static int binarySearch(int[] a, int target, int start, int end) {
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
