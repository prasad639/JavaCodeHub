import java.util.Scanner;

public class kaddanes_max_subarray {

    public static void kaddanes(int arr[], int size){
        int cur_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i<size; i++){
            cur_sum = cur_sum+arr[i]; 
            if(cur_sum<0){
                cur_sum = 0;
            }
            max_sum = Math.max(cur_sum,max_sum);
        }
        System.out.println(max_sum);
    }
    public static void main(String args[]) {

        System.out.println("Enter the size of array");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the next element of array.");
            int element = sc.nextInt();
            arr[i] = element;
        }
        kaddanes(arr,size);

        sc.close();
    }
}
