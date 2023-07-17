import java.util.*;

public class leap_year {
    public static void main(String args []){
        System.out.println("Enter the year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean a = ((year%400 == 0 || year%4==0) && year%100!=0)? true: false;
        if(a == true){
            System.out.println("it is a leap year.") ;
        }
        else{
            System.out.println("it is not a leap year.") ;
        }
        sc.close();
    }
}
