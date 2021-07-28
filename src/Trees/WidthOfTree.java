package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class WidthOfTree {
    public static int maxWidthOfTree(Node root) {
        if (root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int maxWidth = 0;

        while (!q.isEmpty()) {
            int currSize = q.size();
            maxWidth = Math.max(currSize, maxWidth);

            for (int i = 0; i < currSize; i++) {
                Node front = q.poll();
                if (front.right != null) q.add(front.right);
                if (front.left != null) q.add(front.left);
            }
        }
        return maxWidth;
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);

        System.out.print(maxWidthOfTree(root));
    }
}
