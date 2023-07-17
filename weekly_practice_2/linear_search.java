// linear search  tc = O(n)

import java.util.*;

public class linear_search {
    public static int linear(int arr[], int size, int key) {
        for (int i = 0; i <size; i++) {
            if (arr[i] == key) {
                return 1;

            }

        }
        return 0;

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
        System.out.println("enter the value that you want find.");
        int key = sc.nextInt();

        int return_value = linear(arr,size, key);
        if (return_value == 1) {
            System.out.println("The value " + key + "  present in the given array.");
        } else {
            System.out.println("The value  not is present in the given array.");

        }

        sc.close();

    }

}