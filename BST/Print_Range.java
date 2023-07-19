package BST;

public class Print_Range {

    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;

        }
    }

    public static node BST(node root, int val) {
        if (root == null) {
            root = new node(val);
            return root;
        }

        if (val < root.data) {
            root.left = BST(root.left, val);
        } else {
            root.right = BST(root.right, val);
        }

        return root;
    }

    public static void printRange(node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printRange(root.left, k1, k2);

        } else {
            printRange(root.right, k1, k2);
        }

    }

    public static void inorder(node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void main(String args[]) {
        int val[] = { 8, 5, 3, 1, 4, 3, 6, 10, 11, 14 };

        node root = null;
        for (int i = 0; i < 10; i++) {
            root = BST(root, val[i]);
        }

        printRange(root, 5, 12);
        // inorder(root);
    }

}
