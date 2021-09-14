package Searching;

public class BinarySearch {

    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] a, int target) {
        int start = 0, end = a.length - 1;

        while (start <= end) {
            //find the middle element
            // int mid = (start + end) / 2  might extend.....
            int mid = start + (end - start) / 2;
            if (a[mid] > target) {
                end = mid + 1;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
