import java.util.*;

public class prime_number {

    public static boolean prime_cheak(int a) {
        if (a == 2) {
            return true;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        sc.close();
        int number = sc.nextInt();
        boolean a = prime_cheak(number);
        if (a == true) {
            System.out.println("This number is prime number.");
        } else {
            System.out.println("This number is not a  prime number.");

        }

    }
}