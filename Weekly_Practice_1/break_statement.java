import java.util.*;
public class break_statement{
    public static void main(String args []){
        System.out.println("Start entering numbers");
        Scanner sc = new Scanner(System.in);
        do{
            int i = sc.nextInt();
            if (i%10==0){
                break;
            }
            System.out.println(i);
        }while(true);
        sc.close();
    }
}
