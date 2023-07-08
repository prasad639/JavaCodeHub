
package patterns;

import java.util.*;

public class allpatterns {
    Scanner sc = new Scanner(System.in);

    static void Sqaure() {
        System.out.println("Enter the number rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rectangle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number rows");

        int rows = sc.nextInt();
        System.out.println("Enter the number coloumns");

        int cols = sc.nextInt();
        sc.close();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangle() {
        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.println("Enter the no of row of triangle");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {

                System.out.print(" ");

            }

            for (int j = 0; j < (2 * i) + 1; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

    static void diamond(int row) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = row; i >= 0; i--) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        diamond(5);

    }
}
