// first method 
// time comlexity = O(n^2)

import java.util.*;

public class diagonal_sum {
    public static int primary_di_sum(int mat[][], int row, int coloumn) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                if (i == j) {
                    sum = sum + mat[i][j];
                } else if (i + j == row - 1) {
                    sum += mat[i][j];
                }
            }

        }
        return sum;

    }

    public static void main(String args[]) {

        System.out.println("Enter the size of matrix row and coloumn:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int coloumn = sc.nextInt();
        int element = 0;
        int mat[][] = new int[row][coloumn];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                element = sc.nextInt();
                mat[i][j] = element;
            }
        }

        int a = primary_di_sum(mat, row, coloumn);

        System.out.println(a);
        sc.close();

    }

}
