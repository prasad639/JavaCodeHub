import java.util.*;

public class shortest_path {

    public static float shortestpath(String str) {
        int X = 0;
        int Y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                X--;
            }
            if (str.charAt(i) == 'E') {
                X++;
            }
            if (str.charAt(i) == 'N') {
                Y++;
            }
            if (str.charAt(i) == 'S') {
                Y--;
            }
        }
        System.out.println("(" + X + "," + Y + ")");
    // float short_distance =  
        return (float)Math.sqrt(X * X + Y * Y);
    }

    public static void main(String args[]) {

        System.out.println("Enter the string.");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        sc.close();
        float shortest_distance = shortestpath(str);
        System.out.println("shortest distance is : " + shortest_distance +" units");

    }
}
