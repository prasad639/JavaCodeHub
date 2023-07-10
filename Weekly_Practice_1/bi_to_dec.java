import java.util.*;
public class bi_to_dec {

    public static int convert_to_decimal(int a){
        int dec = 0;
        int pow = 0;

while(a>0){
    int last_digit = a%10;
    dec = dec + (last_digit*(int)(Math.pow(2,pow)));
    pow++;
    a = a/10;

} return dec;
    }
    public static void main(String args []){
        System.out.println("enter the binary number");
        Scanner sc = new Scanner(System.in);
        int bi = sc.nextInt();
        System.out.println(convert_to_decimal(bi));
        sc.close();
    }
}
