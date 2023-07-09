package Arraylist;

import java.util.ArrayList;

public class pairsum {
    // Brute force approch 
    // for both sorted and unsorted arraylist
    
    static boolean getpair(ArrayList<Integer> list, int target_sum) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target_sum) {
                    return true;
                }
            }
        }
        return false;
    }

    // opimized approch two pointer
    // for sorted arraylist only 

    static boolean getpair2(ArrayList<Integer> list, int target_sum) {

        int l = 0;
        int r = list.size() - 1;

        while (l != r) {
            int sum = list.get(l) + list.get(r);
            if (sum == target_sum) {
                return true;
            }
            if (sum < target_sum) {
                l++;
            } else {
                r--;
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

        System.out.println(getpair(list, 25));
        System.out.println(getpair2(list, 25));
    }
}
