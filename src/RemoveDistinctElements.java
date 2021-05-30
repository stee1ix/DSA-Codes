import java.util.ArrayList;

public class RemoveDistinctElements {

    static ArrayList<Integer> removeDistinctElements(int[] a) { //with new array
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) continue;
            res.add(a[i]);
        }
        res.add(a[a.length - 1]);
        return res;
    }

    static int removeDistinctElementsEfficient(int[] a) { //without new array
        int currSize = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                a[currSize] = a[i];
                currSize++;
            }
        }
        return currSize;
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 2, 3, 3, 8, 9, 9};
        int res = removeDistinctElementsEfficient(a);
        for (int i = 0; i < res; i++) {
            System.out.print(a[i]);
        }
    }
}
