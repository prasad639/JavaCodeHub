
// no of subarrays = (n(n+1))/2.

import java.util.Scanner;

import java.util.*;

public class print_subarrays {
    public static int subarray(int arr[], int size) {
        int  count = 0;
        for (int i = 0; i < size; i++) {
            int start = i;
            for (int j = i; j < size; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + "  ");
         

                }
                System.out.println();
                count++;
            }
            System.out.print("\n");

        }
        System.out.println("Total no of subarrays are: " + count);
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the new element of array.");
            int element = sc.nextInt();
            arr[i] = element;

        }
        int count = subarray(arr, size);
        int check = (size*(size+1)/2);
        System.out.println(check);
         
       
    }
}
 