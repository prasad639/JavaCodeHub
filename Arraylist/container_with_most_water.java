package Arraylist;

import java.util.ArrayList;
// Brute force approch

public class container_with_most_water {

    static int storedwater(ArrayList<Integer> list) {
        int maxwater = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                int height = Math.min(list.get(i), list.get(j));
                int area = height * (j - i);
                maxwater = Math.max(maxwater, area);
            }
        }
        return maxwater;
    }

    // optimzed approch two pointer

    static int storedwater2(ArrayList<Integer> list) {

        int maxwater = Integer.MIN_VALUE;
        int l = 0;
        int r = list.size() - 1;
        while (l < r) {
            int height = Math.min(list.get(l), (list.get(r)));
            int width = r - l;
            int area = height * width;
            maxwater = Math.max(maxwater, area);
            if (list.get(l) < list.get(r)) {
                l++;
            } else {
                r--;
            }
        }

        return maxwater;

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(40);
        list.add(9);
        list.add(4);
        list.add(1);

        System.out.println(list);
        System.out.println(storedwater(list));
        System.out.println(storedwater2(list));
    }
}
