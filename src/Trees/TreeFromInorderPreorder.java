package Trees;

public class TreeFromInorderPreorder {
    static int preIndex = 0;

    public static Node constructTree(int in[], int pre[], int is, int ie) {
        if (is > ie) return null;
        Node root = new Node(pre[preIndex++]);

        int inIndex = is;
        for (int i = is; i <= ie; i++) {
            if (in[i] == root.key) {
                inIndex = i;
                break;
            }
        }
        root.left = constructTree(in, pre, is, inIndex - 1);
        root.right = constructTree(in, pre, inIndex + 1, ie);
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String args[]) {
        int in[] = {20, 10, 40, 30, 50};
        int pre[] = {10, 20, 30, 40, 50};
        int n = in.length;
        Node root = constructTree(in, pre, 0, n - 1);

        inorder(root);
    }
}
