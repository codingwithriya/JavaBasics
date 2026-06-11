package CollectionsDemo.MapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> marks = new LinkedHashMap<>(10,0.5f,true);
        marks.put("Sham",95);
        marks.put("Tom",95);
        marks.put("Jerry",95);
        marks.put("Bean",95);

        marks.get("Tom");

        System.out.println(marks); // with access order as true it will print the most recent accessed element at last and the oldest accessed element at the first, here tom is accessed most recently, so appears at the end.

        Integer res = marks.getOrDefault("Sima", 0);
        System.out.println("Marks of Sima : "+res);

        marks.putIfAbsent("Shima",60);
        marks.putIfAbsent("Sham",60);

        System.out.println(marks);

    }
}
