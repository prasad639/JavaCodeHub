package Arraylist;

import java.util.ArrayList;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

class custom {

    String name;
    int age;
    Long contact;

    custom(String name, int age, Long contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public String toString() {
        return name + "  " + age + " " + contact;
    }
}

public class intro_arr_list {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(24);
        list.add(23);
        list.add(22);

        list.remove(2);
        int element = list.get(2);

        System.out.println(list.size());
        System.out.println(element);
test t = new test();
        ArrayList<custom> list2 = new ArrayList<>();
        list2.add(new custom("tony", 25, 9874623L));
        System.out.println(list2);
        System.out.println(list2.contains(new custom("tony", 25, 9874623L)));
        System.out.println(t.getClass());
        Class<?>mainclass = intro_arr_list.class;
        String classname  =  mainclass.getName();
        System.out.println(classname);
    }
}


class test{
    public static void ave(){
        int a =6;
        System.out.println(a);
    }
}