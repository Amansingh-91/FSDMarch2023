package DSA;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // abstract data Type(ADT)
        // capable of storing objects
        // to store primitive data types in ADT
        // we use Wrapper Class
        // wrapper classes are classes which convert primitive data_type to object and vice versa
        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<String> alist = new ArrayList<>();
        ll.add(12);

        ll.add(13);
        ll.add(14);
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
        int n =  ll.size();
        System.out.println(n);

        alist.add("Aman");
        alist.add("Divya");
        alist.add("Dharam");

        // alist.remove("Aman");
        System.out.println(alist);

        for (String s : alist) {
            System.out.println(s +" in iterator");
        }
        for (Integer i : ll) {
            System.out.println("in ll" + i);
        }

    }
}
