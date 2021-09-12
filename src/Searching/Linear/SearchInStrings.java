package Searching.Linear;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Rishu";
        char target = 'u';
        System.out.println(search(name, target));
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) { //in for each loop we need an array to iterate, so hence converted string to array
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }
}
