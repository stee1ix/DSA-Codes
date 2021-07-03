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

    }
}
