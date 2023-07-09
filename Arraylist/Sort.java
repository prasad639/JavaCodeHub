package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        System.out.println("Enter the size of the ArrayList:");
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            list.add(element);
        }
        sc.close();
        System.out.println("Original ArrayList: " + list);
        // Ascending order
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
        // Descending order
        Collections.sort(list, Collections.reverseOrder()); // here comparator is used to define logic of sorting
        System.out.println("Sorted ArrayList: " + list);

    }
}
