// code of array list lab other than  course.

package Arraylist;

import java.util.*;

public class lab_5 {
    public static void main(String[] args) {
        System.out.println("1.Add the order");
        System.out.println("0.Exit from the system");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Enter number of orders you want to insert");
                int Orders_count = sc.nextInt();
                order[] order = new order[Orders_count];
                for (int i = 0; i < Orders_count; i++) {
                    System.out.println("Enter order id ");
                    int orderID = sc.nextInt();
                    System.out.println("Enter number of items in this order ");
                    int noofitems = sc.nextInt();
                    System.out.println("Enter Items ");
                    ArrayList<String> itemNames = new ArrayList<String>();
                    for (int j = 0; j < noofitems; j++) {
                        itemNames.add(sc.next());
                    }
                    System.out.println("Enter True for COD otherwise False ");
                    boolean PaymentOption;
                    PaymentOption = sc.nextBoolean();
                    order[i] = new order(orderID, itemNames, PaymentOption);
                }
                ArrayList<order> totalorder = new ArrayList<order>();
                for (int i = 0; i < Orders_count; i++) {
                    totalorder.add(order[i]);
                }
                List<String> items = tester.getItems(totalorder);
                System.out.println(items);
                break;

            case 0:
                System.out.println("Entered 0");
                break;
        }

        sc.close();
    }
}

class order {
    int orderID;
    List<String> itemNames;
    boolean COD;

    public order(int orderID, List<String> itemNames, boolean COD) {
        this.orderID = orderID;
        this.itemNames = itemNames;



        
        this.COD = COD;
    }
}

class tester {
    public static List<String> getItems(List<order> totalorder) {
        List<String> itemList = new ArrayList<String>();
        for (order alloreder : totalorder) {
            itemList.addAll(alloreder.itemNames);
        }

        return itemList;
    }
}