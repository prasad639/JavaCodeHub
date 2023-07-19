package BST;

public class Mirror {

    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;

        }
    }

    public static node mirror(node root) {
        if (root == null) {
            return null;
        }

        node leftsubtree = mirror(root.left);
        node rightsubtree = mirror(root.right);

        root.left = rightsubtree;
        root.right = leftsubtree;

        return root;
    }

    public static void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);

        preorder(root.right);
    }

    public static void main(String args[]) {
        node n = new node(8);
        n.left = new node(4);
        n.right = new node(10);
        n.left.left = new node(3);
        n.left.right = new node(5);
        n.right.left = new node(9);
        n.right.right = new node(11);

        node root = mirror(n);
        preorder(root);

    }

}
