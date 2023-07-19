package BST;

import java.util.ArrayList;

public class leaf_path {

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

    public static void printpath(node root, ArrayList<Integer> list) {
        if (root == null) {
            return;

        }
        list.add(root.data);
        if (root.left == null && root.right == null) {

            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + "  ");
            }
                            System.out.println();

           
        }

        printpath(root.left, list);
        printpath(root.right, list);

        list.remove(list.size() - 1);
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

        ArrayList<Integer> list = new ArrayList<>();

        printpath(root, list);

    }

}
