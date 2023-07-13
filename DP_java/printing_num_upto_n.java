import java.util.*;
public class printing_num_upto_n {
    public static void main(String args []){
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i= 1;
        System.out.println("numbers from 1 to "+ n + " are:");
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
