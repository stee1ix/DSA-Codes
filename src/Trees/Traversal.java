package Trees;

public class Traversal {
    /*Time: O(n) Space: O(h)*/
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + "->");
            inorder(root.right);
        }
    }

    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + "->");
            preorder(root.left);
            preorder(root.right);
        }
    }

    /*Time: O(n) Space: O(h*/
    public static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + "->");
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

    public static int getSize(Node root) {
        if (root == null) return 0; // if no nodes then size is 0
        return 1 + getSize(root.left) + getSize(root.right);
    }

    public static int getMax(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
    }

    static int maxLevel = 0;
    public static void printLeft(Node root, int level) {
        if (root == null) return;
        if (maxLevel < level) {
            System.out.print(root.key + " ");
            maxLevel = level;
        }
        printLeft(root.left, level + 1);
        printLeft(root.right, level + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println("\nInorder");
        inorder(root);
        System.out.println("\npreorder");
        preorder(root);
        System.out.println("\npostorder");
        postorder(root);
        System.out.println("\nheight->" + height(root));
        System.out.println("Size is " + getSize(root));
        System.out.println("Max value is " + getMax(root));
        printLeft(root, 1);
    }
}
