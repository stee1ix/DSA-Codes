import java.util.ArrayDeque;

class NodeChar {
    char data;
    NodeChar next;

    NodeChar(char x) {
        data = x;
        next = null;
    }
}

class PalindromeLL {

    static boolean isPalindrome(NodeChar head) {
        ArrayDeque<Character> a = new ArrayDeque<>();
        for (NodeChar curr = head; curr != null; curr = curr.next) {
            a.push(curr.data);
        }
        for (NodeChar curr = head; curr != null; curr = curr.next) {
            if (a.pop() != curr.data) {
                return false;
            }
        }
        return true;
    }

    // reverse list utility function
    static NodeChar reverseList(NodeChar head) {
        if (head == null || head.next == null) return head;
        NodeChar rest_head = reverseList(head.next);
        NodeChar rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }

    static boolean isPalindromeEfficient(NodeChar head) {
        if (head == null) return true;
        //finding middle node using two pointer reference
        NodeChar slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the list after middle
        NodeChar rev = reverseList(slow.next);
        NodeChar curr = head;
        //check for equal elements in the first part and the second part of the list
        while (rev != null) {
            if (curr.data != rev.data) {
                return false;
            }
            curr = curr.next;
            rev = rev.next;
        }
        return true;
    }

    public static void main(String[] args) {
        NodeChar head = new NodeChar('g');
        head.next = new NodeChar('f');
        head.next.next = new NodeChar('g');
        if (isPalindromeEfficient(head)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
