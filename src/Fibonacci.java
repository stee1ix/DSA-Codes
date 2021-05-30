public class Fibonacci {

    static int nthFibonacci(int n) {
        if (n <= 1) return n; //base case - 0 or 1

        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(3));
    }
}
