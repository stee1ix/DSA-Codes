/*Efficient Solution - find the minimum normal subarray sum and subtract it from the whole arrays sum
* O(n)*/

public class MaxCircularSubarraySum {

    /*kadanes algo to find the find the normal subarray sums*/
    static int normalMaxSum(int[] a) {
        int n = a.length;
        int res = a[0];
        int maxEnding = a[0];

        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + a[i], a[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }

    static int overallMaxSum(int[] a) {
        int n = a.length;
        int maxNormal = normalMaxSum(a);

        if (maxNormal < 0) {
            return maxNormal;
        }

        int arrSum = 0;

        for (int i = 0; i < n; i++) {
            arrSum += a[i];
            a[i] = -a[i]; //inverted the elements of the array (i.e +1 -> -1, -1 -> +1)
        }
        /*when we find maxSum in an inverted array, we are basically finding the minSum in the original array*/
        int maxCircular = arrSum + normalMaxSum(a);
        return Math.max(maxCircular, maxNormal);
    }

    public static void main(String[] args) {
        int a[] = {8, -4, 3, -5, 4};

        System.out.println(overallMaxSum(a));
    }
}
