import java.util.*;

public class pairs {
    public static void print_pairs(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int current = i;
            for (int j = current + 1; j < size; j++) {
                System.out.println("(" + current + "," + j + ")");
            }
        }
    }

    public static void main(String args[]) {

        System.out.println("Enter the size of the array");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the next element of the array");
            int element = sc.nextInt();
            arr[i] = element;
        }
        print_pairs(arr,size);
        sc.close();
    }
}
