/* An element is leader if it is greater than all the elements to its right side.
And the rightmost element is always a leader.
For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
*/

public class LeadersInAnArray {

    static void fun1(int[] a) { // O(n^2)
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) System.out.print(a[i] + " ");
        }
    }

    static void fun2(int[] a) { // O(n), maintain max elem from the right and print it when the max changes
        int max = a[a.length - 1];

        System.out.print(max + " "); //last elem will always be leader

        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                System.out.print(max + " ");
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};

        fun2(a);
    }
}
