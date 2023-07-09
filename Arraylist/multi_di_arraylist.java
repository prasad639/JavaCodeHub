package Arraylist;

// import java.util.*;
import java.util.ArrayList;


public class multi_di_arraylist{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
        ArrayList<Integer>list = new ArrayList<>();

        list.add(5);
        list.add(10);
        mainlist.add(list);
        ArrayList<Integer>list2 = new ArrayList<>();
        mainlist.add(list2);
        list2.add(25);
        list2.add(51);
        System.out.println(mainlist);

        for(int i = 0;i<mainlist.size();i++){
            ArrayList<Integer>currlist = mainlist.get(i);
            for(int j = 0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }


    }
}