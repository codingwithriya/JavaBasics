package CollectionsDemo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
    public static void main(String[] args) {

        // =========================================================
        // BASIC CREATION
        // =========================================================

        CopyOnWriteArrayList<Integer> list =
                new CopyOnWriteArrayList<>();


        // =========================================================
        // ADDING ELEMENTS
        // =========================================================

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Initial List:");
        System.out.println(list);


        // =========================================================
        // GET ELEMENT
        // =========================================================

        System.out.println("\nElement at index 2:");
        System.out.println(list.get(2));


        // =========================================================
        // UPDATE ELEMENT
        // =========================================================

        list.set(2, 100);

        System.out.println("\nAfter set():");
        System.out.println(list);


        // =========================================================
        // REMOVE ELEMENT
        // =========================================================

        list.remove(Integer.valueOf(20));

        System.out.println("\nAfter remove():");
        System.out.println(list);


        // =========================================================
        // CONTAINS
        // =========================================================

        System.out.println("\nContains 40?");
        System.out.println(list.contains(40));


        // =========================================================
        // SIZE
        // =========================================================

        System.out.println("\nSize:");
        System.out.println(list.size());


        // =========================================================
        // addAll()
        // =========================================================

        CopyOnWriteArrayList<Integer> list2 =
                new CopyOnWriteArrayList<>();

        list2.add(1000);
        list2.add(2000);

        list.addAll(list2);

        System.out.println("\nAfter addAll():");
        System.out.println(list);


        // =========================================================
        // ITERATION
        // =========================================================

        System.out.println("\nEnhanced For Loop:");

        for (Integer x : list) {
            System.out.print(x + " ");
        }

        System.out.println();


        // =========================================================
        // SPECIAL FEATURE
        // MODIFYING DURING ITERATION
        // =========================================================

        System.out.println("\nModifying During Iteration:");

        for (Integer x : list) {

            System.out.println("Reading: " + x);

            if (x == 40) {
                list.add(5000);
            }
        }

        System.out.println("\nAfter Iteration:");
        System.out.println(list);


        // =========================================================
        // NORMAL COLLECTIONS WOULD THROW
        // ConcurrentModificationException
        // =========================================================

        /*
           ArrayList example:

           for(Integer x : arrayList){
                arrayList.add(100);
           }

           ---> ConcurrentModificationException

           CopyOnWriteArrayList:

           Safe
        */


        // =========================================================
        // CLEAR
        // =========================================================

        list.clear();

        System.out.println("\nAfter clear():");
        System.out.println(list);

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Butter");

        for (String item : shoppingList){
//            reading the shopping List, that will not show any modifications in this loop
            System.out.println(item);

            if(item.equals("Eggs")){
                shoppingList.add("Bread"); // Adding elements while reding from it. Thus this write is performed in a copy of this list
            }
        }

//        only after the reading and the updation operation is done, only then we can get the updated list
        System.out.println("The Shopping List after Updation: "+shoppingList);



        // =========================================================
        // Do the same Using Multiple threads
        // =========================================================

        // For ArrayList, it will throw Concurrent Modification  exception

//        Exception in reader threadjava.util.ConcurrentModificationException

//        ArrayList<String> a1 = new ArrayList<>();

        CopyOnWriteArrayList<String> a1 = new CopyOnWriteArrayList<>();
        a1.add("Item 1");
        a1.add("Item 2");
        a1.add("Item 3");
        a1.add("Item 4");
        a1.add("Item 5");

        Thread reader = new Thread(()->{
            try {
                while(true){
                    for (String item : a1){
                        System.out.println("Item no..:" + item);
                        Thread.sleep(1000);
                    }
                }
            }catch (Exception e){
                System.out.println("Exception in reader thread"+e);
            }
        });

        Thread writer = new Thread(()->{
            try {
                while(true){
                    a1.add("Item 6");
                    System.out.println("Added Item 6 to the list");
                    Thread.sleep(1000);
                    boolean removed = a1.remove("Item 1");

                    if (removed) {
                        System.out.println("Removed Item 1 from the list");
                    } else {
                        System.out.println("Item 1 not found");
                    }
                }
            }catch (Exception e){
                System.out.println("Exception in reader thread"+e);
            }
        });

        reader.start();
        writer.start();



        // =========================================================
        // IMPORTANT NOTES
        // =========================================================

        /*
         * Read Operations:
         *      Very Fast
         *
         * Write Operations:
         *      Expensive
         *
         * Why?
         *
         * Every write creates a new copy.
         *
         * Best Use Cases:
         *
         * 1. Read-heavy applications
         * 2. Configuration caches
         * 3. Observer lists
         * 4. Event listeners
         *
         * Not Suitable:
         *
         * Frequent insertions/deletions
         */
    }
}