package Trees;

public class Node {
    Node left;
    Node right;
    int key;

    Node(int value) {
        key = value;
        left = right = null;
    }
}