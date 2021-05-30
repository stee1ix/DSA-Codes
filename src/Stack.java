import java.util.ArrayDeque;

public class Stack {
    public static void main(String[] args) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.isEmpty());
    }
}
