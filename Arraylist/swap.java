package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class swap {

    static void swapnumbers(ArrayList<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static void main(String args[]) {
        System.out.println("enter the size of arraylist");
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            list.add(element);
        }

        System.out.println(list);
        swapnumbers(list, 2, 3);

        System.out.println(list);
        sc.close();
    }
}
