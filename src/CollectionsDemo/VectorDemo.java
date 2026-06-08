package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        // =========================================================
        // BASIC VECTOR CREATION
        // =========================================================

        Vector<Integer> vec = new Vector<>();

        // =========================================================
        // ADDING ELEMENTS
        // =========================================================

        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);

        System.out.println("Initial Vector:");
        System.out.println(vec);


        // =========================================================
        // SIZE AND CAPACITY
        // =========================================================

        System.out.println("\nSize:");
        System.out.println(vec.size());

        System.out.println("\nCapacity:");
        System.out.println(vec.capacity());

        /*
         * Unlike ArrayList,
         * Vector exposes capacity directly.
         */


        // =========================================================
        // ADD AT SPECIFIC INDEX
        // =========================================================

        vec.add(2, 100);

        System.out.println("\nAfter add(index, element):");
        System.out.println(vec);


        // =========================================================
        // GET ELEMENT
        // =========================================================

        System.out.println("\nElement at index 2:");
        System.out.println(vec.get(2));


        // =========================================================
        // UPDATE ELEMENT
        // =========================================================

        vec.set(2, 999);

        System.out.println("\nAfter set():");
        System.out.println(vec);


        // =========================================================
        // REMOVE ELEMENTS
        // =========================================================

        vec.remove(2);

        System.out.println("\nAfter remove(index):");
        System.out.println(vec);

        vec.remove(Integer.valueOf(20));

        System.out.println("\nAfter remove(object):");
        System.out.println(vec);

        // =========================================================
        // FIRST AND LAST ELEMENT
        // =========================================================

        System.out.println("\nFirst Element:");
        System.out.println(vec.firstElement());

        System.out.println("\nLast Element:");
        System.out.println(vec.lastElement());


        // =========================================================
        // INSERT ELEMENT AT INDEX
        // =========================================================

        vec.insertElementAt(500, 1);

        System.out.println("\nAfter insertElementAt():");
        System.out.println(vec);


        // =========================================================
        // REMOVE ELEMENT AT INDEX
        // =========================================================

        vec.removeElementAt(1);

        System.out.println("\nAfter removeElementAt():");
        System.out.println(vec);


        // =========================================================
        // CONTAINS
        // =========================================================

        System.out.println("\nContains 30?");
        System.out.println(vec.contains(30));


        // =========================================================
        // INDEX SEARCHING
        // =========================================================

        vec.add(30);

        System.out.println("\nFirst Index of 30:");
        System.out.println(vec.indexOf(30));

        System.out.println("\nLast Index of 30:");
        System.out.println(vec.lastIndexOf(30));


        // =========================================================
        // ITERATION USING ENHANCED FOR LOOP
        // =========================================================

        System.out.println("\nEnhanced For Loop:");

        for (Integer x : vec) {
            System.out.print(x + " ");
        }

        System.out.println();


        // =========================================================
        // ITERATION USING NORMAL FOR LOOP
        // =========================================================

        System.out.println("\nNormal For Loop:");

        for (int i = 0; i < vec.size(); i++) {
            System.out.print(vec.get(i) + " ");
        }

        System.out.println();


        // =========================================================
        // forEach()
        // =========================================================

        System.out.println("\nforEach:");

        vec.forEach(x -> System.out.print(x + " "));

        System.out.println();


        // =========================================================
        // addAll()
        // =========================================================

        Vector<Integer> vec2 = new Vector<>();

        vec2.add(100);
        vec2.add(200);
        vec2.add(300);

        vec.addAll(vec2);

        System.out.println("\nAfter addAll():");
        System.out.println(vec);


        // =========================================================
        // addAll(index, collection)
        // =========================================================

        Vector<Integer> extra = new Vector<>();

        extra.add(777);
        extra.add(888);

        vec.addAll(1, extra);

        System.out.println("\nAfter addAll(index, collection):");
        System.out.println(vec);


        // =========================================================
        // COPY VECTOR
        // =========================================================

        Vector<Integer> copiedVector =
                new Vector<>(vec);

        System.out.println("\nCopied Vector:");
        System.out.println(copiedVector);


        // =========================================================
        // CREATE VECTOR FROM COLLECTION
        // =========================================================

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4);

        Vector<Integer> fromCollection =
                new Vector<>(numbers);

        System.out.println("\nVector From Collection:");
        System.out.println(fromCollection);


        // =========================================================
        // CAPACITY GROWTH
        // =========================================================

        Vector<Integer> v3 = new Vector<>(3);

        System.out.println("\nInitial Capacity:");
        System.out.println(v3.capacity());

        v3.add(10);
        v3.add(20);
        v3.add(30);

        System.out.println("Capacity after filling:");
        System.out.println(v3.capacity());

        v3.add(40);

        System.out.println("Capacity after resize:");
        System.out.println(v3.capacity());

        /*
         * Default growth:
         * Capacity doubles.
         */


        // =========================================================
        // CUSTOM CAPACITY INCREMENT
        // =========================================================

        Vector<Integer> v4 =
                new Vector<>(5, 2);

        /*
         * Initial Capacity = 5
         * Capacity Increment = 2
         */

        System.out.println("\nCustom Capacity Vector:");
        System.out.println(v4.capacity());

        for (int i = 1; i <= 7; i++) {
            v4.add(i);
        }

        System.out.println(v4);
        System.out.println(v4.capacity());


        // =========================================================
        // trimToSize()
        // =========================================================

        Vector<Integer> v5 = new Vector<>();

        for (int i = 1; i <= 20; i++) {
            v5.add(i);
        }

        System.out.println("\nBefore trimToSize:");

        System.out.println("Size: " + v5.size());
        System.out.println("Capacity: " + v5.capacity());

        v5.trimToSize();

        System.out.println("\nAfter trimToSize:");

        System.out.println("Size: " + v5.size());
        System.out.println("Capacity: " + v5.capacity());


        // =========================================================
        // REMOVE ALL ELEMENTS
        // =========================================================

        Vector<Integer> temp = new Vector<>();

        temp.add(1);
        temp.add(2);
        temp.add(3);

        System.out.println("\nBefore clear:");
        System.out.println(temp);

        temp.clear();

        System.out.println("After clear:");
        System.out.println(temp);


        // =========================================================
        // CONVERT VECTOR TO ARRAY
        // =========================================================

        Object[] arr = vec.toArray();

        System.out.println("\nArray:");

        for (Object x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();


        // =========================================================
        // IMPORTANT NOTES
        // =========================================================

        /*
         * Vector is a Legacy Class.
         *
         * Vector implements:
         *      List
         *      RandomAccess
         *      Cloneable
         *      Serializable
         *
         * Vector is SYNCHRONIZED.
         *
         * Therefore:
         *
         * Thread Safe -> YES
         * Faster than ArrayList -> NO
         *
         * ArrayList is preferred
         * in modern applications unless
         * synchronization is specifically needed.
         *
         * ArrayList Growth:
         *      10 -> 15 -> 22 -> ...
         *
         * Vector Growth:
         *      Doubles by default.
         *
         * Vector provides:
         *      capacity()
         *      firstElement()
         *      lastElement()
         *      insertElementAt()
         *      removeElementAt()
         */

//        Thread Safety of Vector Vs Arraylist

        ArrayList<Integer> a1 = new ArrayList<>();
        Vector<Integer> v1 = new Vector<>();

        Thread t1 = new Thread(() ->{
            for (int i = 1; i <= 1000; i++){
                a1.add(i);
                v1.add(i);
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i = 1; i <= 1000; i++){
                a1.add(i);
                v1.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Size of the Arraylist :: " + a1.size());  // this will not be able to perform all the operations as not synchronized thus will print less than 2000
        System.out.println("Size of the Vector :: " + v1.size());  // this will be able to perform all the operations as it is synchronized thus will print less than 2000



        System.out.println("\nProgram Completed.");
    }
}
