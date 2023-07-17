import java.util.*;

public class java1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  // resource leak error warning.

        String a = sc.nextLine();

        System.out.println(a);
        sc.close();

    }
}