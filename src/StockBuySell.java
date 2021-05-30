/*We know the stock prices in advance so
 * when the price reaches the lowest we will buy
 * then when the price reaches the highest we will sell
 * then again when price reaches the next lowest we will buy
 * and again when the price reaches the next highest we will sell
 * O(n)
 * {1, 5, 3, 8, 12}
 * (5 - 1) + (12 - 3) = 13*/

public class StockBuySell {
    static int maxProfit(int[] a) {
        int n = a.length;

        int profit = 0;

        for (int i = 1; i < n; i++) {
            /*whenever the price is increasing we will add the difference to the profit*/
            if (a[i] > a[i - 1]) {
                profit += a[i] - a[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 3, 8, 12};
        System.out.println(maxProfit(a));
    }
}
