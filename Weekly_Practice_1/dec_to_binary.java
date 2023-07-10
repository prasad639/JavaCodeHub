import java.util.*;

public class dec_to_binary {
    public static int convert_to_binary(int a){
        int rem = 0;
     
        int binary = 0;
        int pow = 0;
        while(a>0){
            rem = a%2;
            binary = binary + (rem*(int)(Math.pow(10,pow)));
            a = a/2;
            pow++;
        }
        return binary;
    }
    public static void main(String args []){
        System.out.println("enter the decimal number");
        Scanner sc = new Scanner(System.in);
        int bi = sc.nextInt();
        System.out.println(convert_to_binary(bi));
        sc.close();

    }
}
