import java.util.*;
public class factorial {
    public static int factorial2(int a){
        int fact = 1;
        for(int i = 1; i<=a;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int binomial(int n , int r){


int binomial = factorial2(n)/(factorial2(r)*factorial2(n-r));
return binomial;    
    }
    public static void main(String args []){
        System.out.println("enter the value of n and r");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binomial(n,r));

        sc.close();
    }
}
