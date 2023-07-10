import java.util.*;

public class area {
    public static void main(String args []){
        System.out.println("Enter the value of sides of a square");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int Area = side*side;
        System.out.println("Area of a square is :" + Area);
        sc.close();
    }
}
