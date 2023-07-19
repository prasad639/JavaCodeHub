package BST;

public class Sorted_arr_to_bal_BST {

    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;

        }
    }

    public static node bal_bst(int arr[], int si, int ei) {

        if (si > ei) {
            return null;
        }

        int mid = (si + ei) / 2;
        node root = new node(arr[mid]);
        root.left = bal_bst(arr, si, mid - 1);
        root.right = bal_bst(arr, mid + 1, ei);

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
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
        node root = bal_bst(arr, 0, arr.length - 1);
        preorder(root);

    }
}
