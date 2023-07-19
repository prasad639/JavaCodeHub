package BST;

public class delete_node {
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

    public static node delete1(node root, int key) {
        if (root == null) {
            System.out.println("tree is empty");
            return null;
        }

        if (key < root.data) {

            root.left = delete1(root.left, key);

        } else if(key > root.data) {
             root.right = delete1(root.right, key);

        }else{

        if(root.left == null && root.right == null){  // leaf node
            return null;
        }else if(root.left == null){       // one child
            return root.right;
        }else if(root.right == null){
             return root.left;             //  one child
        }
    }

        return root;

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
        int val[] = { 5, 1, 3, 4, 2, 7 };

        node root = null;
        for (int i = 0; i < 6; i++) {
            root = BST(root, val[i]);
        }

        root = delete1(root, 2);
        inorder(root);
    }
}
