/*Majority Element is occurs more than n/2 times(i.e. at least n/2+1 times) in the array , n = size of array*/

public class MajorityElement {
    /*naive - O(n^2)*/
    static int findMajority(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) count++;
            }

            if (count > n / 2) return i;
        }
        return -1;
    }
    /*naive end*/

    /*efficient - O(n)*/
    static int findMajorityEfficient(int arr[]) {
        int n = arr.length;
        int res = 0, count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        count = 0;

        for (int i = 0; i < n; i++)
            if (arr[res] == arr[i]) {
                count++;
            }

        if (count <= n / 2) {
            res = -1;
        }

        return res;
    }
    /*efficient end*/

    public static void main(String[] args) {
        int[] a = {8, 8, 6, 6, 6, 4, 6};
        System.out.println(findMajorityEfficient(a));
    }
}
