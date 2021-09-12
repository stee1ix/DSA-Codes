package Searching.Linear;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {2, 9, 26, 87, 23};
        int target = 26;
        int ans = min(nums);
        System.out.println(ans);
    }

    //assume arr.length != 0
    //return the minimum value in the array
    private static int min(int[] nums) {
        int min = nums[0];

        for (int index = 1; index < nums.length; index++) {
            if (nums[index] < min) {
                min = nums[index];
            }
        }
        return min;
    }
}
