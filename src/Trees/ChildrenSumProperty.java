package Trees;

public class ChildrenSumProperty {
    /*
    Sum of children equal to Node value is said to be following children sum property
    Empty Tree is also true and and single node tree is also true */
    public static boolean isChildrenSumProp(Node root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;

        int sum = 0;
        if (root.left != null) sum += root.left.key;
        if (root.right != null) sum += root.right.key;
        return (sum == root.key && isChildrenSumProp(root.left) && isChildrenSumProp(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.right.left = new Node(3);
        root.right.right = new Node(9);

        System.out.println(isChildrenSumProp(root));
    }
}
