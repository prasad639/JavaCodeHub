package Arraylist;

import java.util.ArrayList;

// two pointer approch for sorted and rotated array.
public class pairsum_rotated_sorted {
    static boolean getpair(ArrayList<Integer> list, int targetsum){
        int pivot = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int r = pivot;
        int l = pivot + 1;
        while (r != l) {
            if (list.get(l) + list.get(r) == targetsum) {
                return true;
            }
            if (list.get(l) + list.get(r) < targetsum) {
                l = (l + 1) % list.size();
            } else {
                r = (r + list.size() - 1) % list.size();
            }
        }
        return false;

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

        System.out.println(getpair(list, 42));
    }
}
