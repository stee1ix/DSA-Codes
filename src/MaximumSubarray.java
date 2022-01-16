public class MaximumSubarray {
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + maxSum(a));
    }

    private static int maxSum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int j : arr) {
            maxEndingHere += j;
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }
}
