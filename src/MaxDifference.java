/*
Max value of a[j] - a[i], where j > i

*if it is a sorted array then result will be lastElem - firstElem
*/

public class MaxDifference {
    static int maxDiff1(int[] a) { // O(n^2)
        int res = a[1] - a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                res = Math.max(res, a[j] - a[i]);
            }
        }
        return res;
    }

    static int maxDiff2(int[] a) { // O(n)
        int minVal = a[0];
        int res = a[1] - a[0];

        for (int i = 1; i < a.length; i++) {
            res = Math.max(res, a[i] - minVal);
            minVal = Math.min(minVal, a[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxDiff2(new int[]{2, 3, 10, 6, 4, 8, 1}));
    }
}
