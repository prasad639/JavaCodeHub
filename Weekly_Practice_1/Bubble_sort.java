/*In bubble sort first loop is for no of turns and second loop is 
for comparison of elements.
*/

import java.util.*;

public class Bubble_sort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr.length - 1 - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
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
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
