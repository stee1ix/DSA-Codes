package Searching.Linear;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {2, 9, 26, 87, 23};
        int target = 26;
        int ans = linearSearch(nums, target, 1, 4);
        System.out.println(ans);
    }

    // search for target in the range [start, end]
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        //search the array; return the index if found
        //otherwise if item not found the return -1

        for (int index = start; index < end; index++) {
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
}
