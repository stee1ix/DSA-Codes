import java.lang.*;
import java.util.*;
import java.util.Stack;

public class BalancedParenthesisOnlyRound {
    public static boolean check(String A) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i< A.length();i++) {
            char c1 = A.charAt(i);
            if(c1 == '(') {
                s.push(c1);
            } else {
                if(s.isEmpty()){
                    return false;
                }
                char c2 = s.pop();
                if(c2 != '(') {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while(t > 0) {
            String A = in.next();

            boolean flag = check(A);

            if(flag) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

            t--;
        }
    }
}