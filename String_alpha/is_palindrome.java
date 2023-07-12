import java.util.*;

public class is_palindrome {
    public static boolean palindrome(String str) {
        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(0) == str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        System.out.println("Enter the string.");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        sc.close();
        if (palindrome(str) == true) {
            System.out.println("This string is not a palindrome");
        } else {
            System.out.println("This string is a palindrome");
        }

    }
}
