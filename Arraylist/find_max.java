package Arraylist;

import java.util.*;

public class find_max{

    static int max(ArrayList<Integer>list){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }
public static void main(String args[]){
    ArrayList<Integer>list = new ArrayList<>();
    System.out.println("enter the element in array:"+ "\n To exit enter -1");
    Scanner sc = new Scanner(System.in);
    int element = 0;
    while(element!=-1){

        element = sc.nextInt();
        list.add(element);
    }
    sc.close();

    System.out.println(list);
    System.out.println(max(list));

}
}