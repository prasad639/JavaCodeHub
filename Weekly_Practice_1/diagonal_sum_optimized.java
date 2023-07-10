// optimized solution for digonal sum 
// time complexity = O(n)  space complexity = O(1)
import java.util.*;

public class  diagonal_sum_optimized {
   
    static public int primary_di_sum(int mat[][], int row, int coloumn) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum+=mat[i][i];
            if(i!=row-i-1)
            sum+=mat[i][row-i-1];

        }
        return sum;

    }

    static  public void main(String  args[]) {

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
        // public static final j = 10;

    }

}


