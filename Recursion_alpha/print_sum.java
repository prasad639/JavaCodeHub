public class print_sum {
    public static int display_sum(int n){
        int sum1 = 0;
        int sum = 0;
        if(n == 1){
            return 1;    // base case
        }
        sum1 = display_sum(n-1);
        sum = n + sum1;
        return sum;
    }
    public static void main(String args []){
        int n = 5;
        System.out.print("Sum of first  " +  n  + "  natural numbers is : " + display_sum(n));

    }
    }
 