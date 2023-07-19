package BST;

public class validate_BST {

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

    static int maxvalue = 0;

    public static int max(node root) {

        if (root == null) {
            return 0;
        }
        int curr = root.data;
        int lmax = max(root.left);
        int rmax = max(root.right);

        maxvalue = Math.max(maxvalue, curr);

        return maxvalue;
    }

    static int minvalue = Integer.MAX_VALUE;

    public static int min(node root) {

        if (root == null) {
            return 0;
        }
        int curr = root.data;
        int lmin = min(root.left);
        int rmin = min(root.right);

        minvalue = Math.min(minvalue, curr);

        return minvalue;
    }

    public static boolean validate(node root) {
       

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
        int val[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        node root = null;
        for (int i = 0; i < 9; i++) {
            root = BST(root, val[i]);

        }

        // int maxvalue = max(root);
        // int minvalue = min(root);
        // System.out.println(maxvalue + " " + minvalue);

        if (validate(root)) {
            System.out.println("Tree is validate tree");
        } else {
            System.out.println("Tree is not validate");
        }

    }

}
