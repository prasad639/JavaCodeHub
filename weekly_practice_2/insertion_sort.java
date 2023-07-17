import java.util.*;
import java.util.Arrays;

public class insertion_sort {
    public static void insert_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // finding the right position for current element.
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;

        }

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            arr[i] = element;
        }
        sc.close();
        Arrays.sort(arr);
        // insert_sort(arr);
        display(arr);

    }
}
