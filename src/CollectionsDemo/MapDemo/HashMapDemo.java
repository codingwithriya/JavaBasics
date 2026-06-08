package CollectionsDemo.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> h1 = new HashMap<>();
        h1.put(35,"Neha");
        h1.put(2,"Rina");
        h1.put(25,"Mita");
        h1.put(5,"Rima");
        h1.put(15,"Soniya");
        System.out.println(h1);
        System.out.println("The Entries in key 2 is : " + h1.get(2));
        System.out.println("Does h1 contains the key 35 ? : " + h1.containsKey(35));
        System.out.println("Does h1 contains the value \"Riya\" ? : " + h1.containsValue("Riya"));

//        ================================
//        Using enhanced for loop for the Keys
//        ================================

        for (int key : h1.keySet()){
            System.out.println( "Key : " + key + "\t Value : " + h1.get(key));
        }

//        ================================
//        Using enhanced for loop for the Keys
//        ================================

        for (Map.Entry<Integer, String> entry : h1.entrySet()){
            System.out.println("The Entry no.  : " + entry);
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(h1);
        boolean res = h1.remove(15, "SONIYA");
        System.out.println("REMOVED ? :" + res);
        System.out.println(h1);

    }
}
