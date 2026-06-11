package CollectionsDemo.MapDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcacheDemo<K,V> extends LinkedHashMap<K,V> {

    private int capacity;
    public LRUcacheDemo(int capacity){
        super(capacity,075f, true);
            this.capacity= capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUcacheDemo<String,Integer> stdMap = new LRUcacheDemo<>(3);
        stdMap.put("Bob",125);
        stdMap.put("sam",125);
        stdMap.put("Tim",125);
        stdMap.put("Tom",125);

        stdMap.get("Bob");

        System.out.println(stdMap);

    }
}

