public class FreqSortedArray {

    /*start from the second index and compare the current element with the previous one
     * if same then freq++ else print the previous element and move forward
     * if the last element is single then print it with freq 1*/
    static void printFreq(int[] a) {
        int freq = 1, i = 1, n = a.length;

        while (i < n) {
            while (i < n && a[i - 1] == a[i]) {
                freq++;
                i++;
            }
            System.out.println(a[i - 1] + "-" + freq);
            i++;
            freq = 1;
        }
        if (n == 1 || a[n - 1] != a[n - 2]) {
            System.out.println(a[n - 1] + "-" + 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 5, 7, 7, 8};
        printFreq(a);
    }
}
