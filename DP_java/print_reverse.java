import java.util.*;
public class print_reverse {
    public static void main(String args []){
      System.out.println("Enter a number");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      while(num>0){
        int last_digit = num%10;
        System.out.print(last_digit);
        num  = num/10;
      }

    }
}
