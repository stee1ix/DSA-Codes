import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesis { //Time - O(n), Space - O(n)

    static boolean matching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
    }

    static boolean isBalanced(String s) {
        ArrayDeque<Character> str = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                str.push(c);
            } else {
                if (str.isEmpty()) {
                    return false;
                } else if (!matching(str.peek(), c)) {
                    return false;
                } else {
                    str.pop();
                }
            }
        }
        return str.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(isBalanced(s));
    }
}
