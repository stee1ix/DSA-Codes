class LeftRotateDTimes {

    /* Naive solution -> leftRotateD runs leftRotateByOne
     * d times. Time - O(nd) Space - O(1) */
    static void leftRotateByOne(int[] a, int n) {
        int temp = a[0];
        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        a[n - 1] = temp;
    }

    static void leftRotateDTimes(int[] a, int n, int d) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(a, n);
        }
    }
    /*Naive End*/

    /*Efficient Solution - Time O(n), Space O(d)
     * we copy the first d elements in temp array
     * shift rest of the elements to the left d times
     * copy the temp to the last*/
    static void leftRotateEfficient(int[] a, int n, int d) {
        int[] temp = new int[d];
        /*copy first d elements in temp*/
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];
        }
        /*shift d to n elements d times left*/
        for (int i = d; i < n; i++) {
            a[i - d] = a[i];
        }
        /*copy temp to the last*/
        for (int i = 0; i < d; i++) {
            a[n - d + i] = temp[i];
        }
    }
    /*Efficient End*/

    /*Reversal Method - Time O(n) Space O(1)
     * reverse the first d elements
     * reverse the rest elements
     * reverse the whole array*/
    static void reverse(int[] a, int low, int high) {
        while (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;

            low++;
            high--;
        }
    }

    static void reversalShift(int[] a, int n, int d) {
        reverse(a, 0, d - 1);
        reverse(a, d, n - 1);
        reverse(a, 0, n - 1);
    }
    /*Reversal End*/

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
//        leftRotateDTimes(a, 6, 2);
//        leftRotateEfficient(a, 6, 2);
        reversalShift(a, 6, 2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}