package Searching.Binary;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 10,  14, 18};
        int target = 1;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index of the greatest no. <= target
    static int floor(int[] a, int target) {
        int start = 0, end = a.length - 1;

        while (start <= end) {
            //find the middle element
            // int mid = (start + end) / 2  might extend.....
            int mid = start + (end - start) / 2;
            if (a[mid] > target) {
                end = mid - 1;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return end;
    }
}
