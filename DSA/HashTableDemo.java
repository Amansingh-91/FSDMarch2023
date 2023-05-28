package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class HashTableDemo{
    public static void main(String[] args) {
        // is syncronized
        Hashtable<String,Integer> table = new Hashtable<>();
        // add 
        table.put("Aman", 27);
        table.put("Divya", 26);

        table.put("Dharam", 27);
        // update
        table.put("Aman", 28);
        System.out.println(table);

        System.out.println(table.get("Dharam"));
        // non syncronized
        HashMap<String, Integer> map = new HashMap<>();
        // add 
        map.put(null, 27);
        map.put("Divya", 26);

        map.put("Dharam", 27);
        // update
        map.put("Aman", 28);
        System.out.println(map);

        System.out.println(map.get("Dharam"));

        map.remove("Aman");
        System.out.println(map);

        HashSet<String> set = new HashSet<>();

        set.add("aman");
        set.add("divya");

        set.add("dharam");
        set.add("aman");

        System.out.println(set);
        set.remove("aman");
        System.out.println(set);

        HashMap<String, ArrayList<String>> contactList = new HashMap<>();

        contactList.put("Aman", new ArrayList<>());
        contactList.get("Aman").add("1234567890");
        contactList.get("Aman").add("9874562310");

        System.out.println(contactList);


    }    
}