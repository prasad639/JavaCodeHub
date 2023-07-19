package BST;

public class create_BST {

    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

    public static node buildbst(node root, int val) {

        if (root == null) {
            root = new node(val);
            return root;
        }
        if (val < root.data) {
            root.left = buildbst(root.left, val);
        } else {
            root.right = buildbst(root.right, val);
        }
        return root;
    }

    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void main(String args[]) {
        int val[] = { 5, 1, 3, 4, 2, 7 };

        node root = null;
        for (int i = 0; i < 6; i++) {
            root = buildbst(root, val[i]);
        }

        inorder(root);

    }
}
