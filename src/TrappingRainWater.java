public class TrappingRainWater {

    /*naive - O(n^2)*/
    static int getWater(int[] a) {
        int n = a.length;
        int res = 0;

        for (int i = 1; i < n - 1; i++) {

            int lMax = a[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, a[j]);
            }

            int rMax = a[i];
            for (int j = i + 1; j < n; j++) {
                rMax = Math.max(rMax, a[j]);
            }
            res += Math.min(lMax, rMax) - a[i];
        }

        return res;
    }

    /*efficient - O(n)
     * here we precompute the leftMax and rightMax of each element
     * a[] = {5, 0, 6, 2, 3}
     * lMax = {5, 5, 6, 6, 6}
     * rMax = {6, 6, 6, 3, 3}*/
    static int getWaterEfficient(int[] a) {
        int n = a.length;
        int res = 0;
        int[] lMax = new int[n]; //store the lMax of each element here
        int[] rMax = new int[n]; //store the rMax of each element here

        lMax[0] = a[0];
        // find lMax from the left side
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(a[i], lMax[i - 1]);
        }

        rMax[n - 1] = a[n - 1];
        // find rMax from the right side
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(a[i], rMax[i + 1]);
        }

        for (int i = 0; i < n - 1; i++) {
            res += Math.min(lMax[i], rMax[i]) - a[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {3, 0, 1, 2, 5};
        System.out.println(getWaterEfficient(a));
    }
}
