package Searching.Linear;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2, 9, 26, 87, 23};
        int target = 87;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //search the array; return the index if found
        //otherwise if item not found the return -1

        for (int index = 0; index < arr.length; index++) {
            //check for element at every index
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }

    //search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run the loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return Integer.MAX_VALUE;
    }

    //search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //run the loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return false;
    }
}
