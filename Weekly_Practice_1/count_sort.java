import java.util.*;

public class count_sort {
    public static void countsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // count array storing the frequency of the array elements.
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

        }
        // sorting algorithm.
        int j = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // // update the count array

        // for(int i = 1; i<count.length;i++){
        // count[i] += count[i-1];
        // }

        // int arr1 [] = new int[arr.length];
        // for(int i = arr.length-1; i>=0;i--){
        // arr1[count[arr[i]]-1] = arr[i];
        // }

        // // copying the sorted array to main array.
        // for(int i = 0;i<arr.length;i++){
        // arr[i] = arr1[i];
        // }

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
        countsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
