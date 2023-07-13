// Brute force sum  i.e basic technique solve this  problem 
// its time complexitivity is very bad i.e. O(n^3)

import java.util.Scanner;



public class max_subarray_sum {
    public static int subarray(int arr[], int size) {
        // int  count = 0;
        int current_sum = 0 ;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int start = i;
            for (int j = i; j < size; j++) {
                int end = j;
                current_sum = 0 ;
                for (int k = start; k <= end; k++) {
                    current_sum = current_sum + arr[k];
                 
         

                }
                System.out.print(current_sum + " ");
                if(current_sum > max_sum){
                    max_sum = current_sum;
                }
                System.out.println();
                // count++;
            }
            System.out.print("\n");

        }
        System.out.println("Maximum of sum of subarrays is : " + max_sum);
        return max_sum;
        
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
        subarray(arr, size);
        
        sc.close();
       
    }
}
 