package Trees;

public class BalancedBinaryTree {
    /*Returns -1 if the tree is imbalanced else return the height of the tree*/
    public static int isBalanced(Node root) {
        if (root == null) return 0;
        int leftSubTree = isBalanced(root.left);
        if (leftSubTree == -1) return -1;
        int rightSubTree = isBalanced(root.right);
        if (rightSubTree == -1) return -1;

        if (Math.abs(leftSubTree - rightSubTree) > 1) return -1;
        return Math.max(leftSubTree, rightSubTree) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(15);
        root.right.right = new Node(20);

        if (isBalanced(root) > 0)
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");
    }
}
