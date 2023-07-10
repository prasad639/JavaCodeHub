import java.util.*; // Binary search array is applicable on the sorted array only.

public class binary_search {

    public static int bi_search(int arr[], int size, int key) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return key;
            }
            if (arr[mid] < key) {
                start = mid+1;
            }
            if (arr[mid] > key) {
                end = mid -1;

            }

        }
        return -1;
    }

    public static void main(String args[]) {
        System.out.println("Enter the size of the array.");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the new element of array");
            int element = sc.nextInt();
            arr[i] = element;
        }

        System.out.println("Enter the element to be search");
        int key = sc.nextInt();

        int return_key = bi_search(arr, size, key);
        if (return_key == key) {
            System.out.println("Key is found.");
        } else {
            System.out.println("Key is not present in the array.");
        }
        sc.close();

    }
}