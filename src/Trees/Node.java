package Trees;

public class Node {
    Node left;
    Node right;
    int key;

    Node(int k) {
        key = k;
        left = right = null;
    }
}