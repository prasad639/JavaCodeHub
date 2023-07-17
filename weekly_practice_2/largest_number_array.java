import java.util.*;  // This library is also required for Integer.MIN_value etc

public class largest_number_array {

    public static int largest(int arr[], int size) {
        int largest = Integer.MIN_VALUE;   // it shows -ve infinity 
        for (int i = 0; i < size; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;

    }

    public static void main(String args[]) {
        System.out.println("Enter the size of array.");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the array element.");
            int element = sc.nextInt();
            arr[i] = element;

        }

        int return_value = largest(arr, size);
        System.out.println("the largest value of given array is " + return_value);

        sc.close();

    }

}
