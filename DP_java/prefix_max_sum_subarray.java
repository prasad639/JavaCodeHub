// prefix sum  i.e optimize technique solve this  problem 
// its time complexitivity is  O(n^2)

import java.util.Scanner;

import java.util.*;

public class prefix_max_sum_subarray  {
    public static int subarray(int arr[], int size) {
        int current_sum = 0;
        int prefix[] = new int[size] ;
        prefix[0] = arr[0];
        for(int i = 1; i<size; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int start = i;
            for (int j = i; j < size; j++) {
                int end = j;
             current_sum = 0;
             current_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            
                // System.out.print(current_sum + " ");  // why this line generates an error.
                if(current_sum > max_sum){
                    max_sum = current_sum;
                }
            }
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
        int max_sum = subarray(arr, size);
        
         
       
    }
}
 