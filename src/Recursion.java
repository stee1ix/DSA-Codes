public class Recursion {

    static void subsets(String s, String curr, int i) { //subsets of string s, pass curr="" and i=0
        if (i == s.length()) {
            System.out.print(curr + " ");
            return;
        }
        subsets(s, curr, i + 1);
        subsets(s, curr + s.charAt(i), i + 1);
    }

    static int subsetSum(int[] a, int n, int sum) { //how many subsets of array a has sum equal to sum
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }
        return subsetSum(a, n - 1, sum) + subsetSum(a, n - 1, sum - a[n - 1]);
    }

    static void BinaryOf(int n) { //prints binary of n>0
        if (n == 0) return;

        BinaryOf(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        BinaryOf(7);
        subsets("abc", "", 0);
        System.out.print(subsetSum(new int[]{10, 20, 15}, 3, 0));
    }
}
