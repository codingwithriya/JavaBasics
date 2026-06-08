package CollectionsDemo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrList {

    public static void main(String[] args) throws Exception {

        // =========================================================
        // BASIC ARRAYLIST CREATION
        // =========================================================

        ArrayList<Integer> myList = new ArrayList<>();


        // =========================================================
        // ADDING ELEMENTS
        // =========================================================

        myList.add(20);
        myList.add(10);
        myList.add(30);
        myList.add(80);
        myList.add(390);


        // =========================================================
        // PRINTING USING ENHANCED FOR LOOP
        // =========================================================

        System.out.println("Elements in myList:");

        for (int n : myList) {
            System.out.print(n + " ");
        }

        System.out.println();


        // =========================================================
        // REMOVING ELEMENT by index
        // remove(index)
        // =========================================================

        myList.remove(2); // removes 30

        // =========================================================
        // REMOVING ELEMENT by value
        // remove(object)
        // =========================================================

        System.out.println("Before object removal : "+myList);

        myList.remove(Integer.valueOf(390));    // First convert it into its wrapper class object  and then pass the object to be removed.

        System.out.println("After object removal : "+myList);

        // adding the removed object
        myList.set(2,390);

        // For a string array
        ArrayList<String> myListObj = new ArrayList<>();

        myListObj.add("fruits");
        myListObj.add("vegetables");
        myListObj.add("soup");
        myListObj.add("junk");
        myListObj.add("juice");

        System.out.println("New list :: " + myListObj);

        // Remove by object, here we can directly remove it without parsing to a wrapper class as it is not confuse between index integer and value integer
        myListObj.remove("junk");
        System.out.println("New list  after removal of object :: " + myListObj);


        // =========================================================
        // INSERTING ELEMENT AT SPECIFIC INDEX
        // add(index, value)
        // =========================================================

        myList.add(2, 40);

        System.out.println("\nAfter removing and inserting:");
        System.out.println(myList);


        // =========================================================
        // UPDATING ELEMENT
        // set(index, value)
        // =========================================================

        myList.set(2, 100);

        System.out.println("\nAfter updating:");
        System.out.println(myList);


        // =========================================================
        // GETTING ELEMENT
        // =========================================================

        System.out.println("\nElement at index 3:");
        System.out.println(myList.get(3));


        // =========================================================
        // SIZE OF ARRAYLIST
        // =========================================================

        System.out.println("\nSize of myList:");
        System.out.println(myList.size());


        // =========================================================
        // CHECKING IF LIST CONTAINS ELEMENT
        // =========================================================

        System.out.println("\nContains 80?");
        System.out.println(myList.contains(80));


        // =========================================================
        // INDEX OF ELEMENT
        // =========================================================

        System.out.println("\nIndex of 390:");
        System.out.println(myList.indexOf(390));


        // =========================================================
        // CLEARING LIST
        // =========================================================

        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(1);
        temp.add(2);
        temp.add(3);

        System.out.println("\nBefore clear:");
        System.out.println(temp);

        temp.clear();

        System.out.println("After clear:");
        System.out.println(temp);


        // =========================================================
        // ARRAYLIST INTERNAL CAPACITY USING REFLECTION
        // =========================================================

        /*
           ArrayList internally uses an array called:

           private Object[] elementData;

           Capacity is NOT publicly accessible.
           So reflection is used to access the internal array.
        */

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(20);

        System.out.println("\nSize of l1:");
        System.out.println(l1.size());


        // Reflection starts here

        Field field = ArrayList.class.getDeclaredField("elementData");

        // Allows access to private field
        field.setAccessible(true);

        // Getting actual internal array from l1 object
        Object[] arr = (Object[]) field.get(l1);

        System.out.println("Capacity of l1:");
        System.out.println(arr.length);


        // =========================================================
        // ARRAYLIST RESIZING
        // =========================================================

        /*
           Initial capacity = 10

           When capacity exceeds,
           ArrayList grows approximately by:

           newCapacity = oldCapacity + oldCapacity / 2
        */

        ArrayList<Integer> l2 = new ArrayList<>(10);

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);
        l2.add(60);
        l2.add(70);
        l2.add(80);
        l2.add(90);
        l2.add(100);

        // Exceeds initial capacity
        l2.add(110);

        System.out.println("\nSize of l2:");
        System.out.println(l2.size());


        Object[] arr2 = (Object[]) field.get(l2);

        System.out.println("Capacity after resizing:");
        System.out.println(arr2.length);


        // =========================================================
        // trimToSize()
        // Reduces capacity to current size
        // =========================================================

        l2.remove(2);
        l2.remove(2);

        System.out.println("\nAfter removing elements:");
        System.out.println(l2);

        l2.trimToSize();

        arr2 = (Object[]) field.get(l2);

        System.out.println("Capacity after trimToSize:");
        System.out.println(arr2.length);


        // =========================================================
        // GETTING CLASS NAME
        // =========================================================

        System.out.println("\nClass name of l2:");
        System.out.println(l2.getClass().getName());

        // =========================================================
        // addAll()
        // Adds all elements of one collection into another
        // =========================================================

                ArrayList<Integer> nums1 = new ArrayList<>();

                nums1.add(10);
                nums1.add(20);
                nums1.add(30);

                ArrayList<Integer> nums2 = new ArrayList<>();

                nums2.add(100);
                nums2.add(200);

                System.out.println("\nBefore addAll():");

                System.out.println("nums1 = " + nums1);
                System.out.println("nums2 = " + nums2);


        // Adds all elements of nums2 at the end of nums1
                nums1.addAll(nums2);

                System.out.println("\nAfter addAll():");

                System.out.println("nums1 = " + nums1);
                System.out.println("nums2 = " + nums2);



        /*
           OUTPUT:

           nums1 = [10, 20, 30]
           nums2 = [100, 200]

           After addAll():

           nums1 = [10, 20, 30, 100, 200]
           nums2 = [100, 200]
        */


// =========================================================
// addAll(index, collection)
// Inserts collection from specific index
// =========================================================

        ArrayList<Integer> nums3 = new ArrayList<>();

        nums3.add(1);
        nums3.add(2);
        nums3.add(3);

        ArrayList<Integer> nums4 = new ArrayList<>();

        nums4.add(50);
        nums4.add(60);

        System.out.println("\nBefore indexed addAll():");
        System.out.println(nums3);


// Insert nums4 elements starting at index 1
        nums3.addAll(1, nums4);

        System.out.println("\nAfter indexed addAll():");
        System.out.println(nums3);





        // =========================================================
        // ARRAYLIST FROM ANOTHER COLLECTION
        // =========================================================

        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);

        ArrayList<Integer> list2 = new ArrayList<>(list1);

        System.out.println("\nArrayList from another collection:");
        System.out.println(list2);


        // =========================================================
        // USING Arrays.asList()
        // =========================================================

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4);

        System.out.println("\nUsing Arrays.asList:");
        System.out.println(list3);


        /*
           Arrays.asList() returns fixed-size list.

           add() and remove() operations are NOT allowed.
        */

        // list3.add(10); // Throws exception


        // =========================================================
        // ARRAY TO LIST CONVERSION
        // =========================================================

        Integer[] ar1 = {10, 20, 30};

        List<Integer> l3 = Arrays.asList(ar1);

        System.out.println("\nArray converted to List:");
        System.out.println(l3);


        // =========================================================
        // CLASS NAME OF Arrays.asList()
        // =========================================================

        System.out.println("\nClass name of l3:");
        System.out.println(l3.getClass().getName());


        // =========================================================
        // USING List.of() (JAVA 9+)
        // =========================================================

        List<Integer> lst = List.of(1, 2, 3, 4);

        System.out.println("\nUsing List.of():");
        System.out.println(lst);


        /*
           List.of() creates immutable list.

           add(), remove(), set() all throw exception.
        */

        // lst.add(10); // Throws exception


        // =========================================================
        // CONVERTING IMMUTABLE LIST TO MUTABLE ARRAYLIST
        // =========================================================

        ArrayList<Integer> mutableList =
                new ArrayList<>(List.of(1, 2, 3));

        mutableList.add(100);

        System.out.println("\nMutable ArrayList from List.of:");
        System.out.println(mutableList);


        // =========================================================
        // NESTED ARRAYLIST (2D ARRAYLIST)
        // =========================================================

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(4);

        matrix.add(row1);
        matrix.add(row2);

        System.out.println("\n2D ArrayList:");
        System.out.println(matrix);


        // =========================================================
        // ITERATING USING NORMAL FOR LOOP
        // =========================================================

        System.out.println("\nUsing normal for loop:");

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }

        System.out.println();


        // =========================================================
        // ITERATING USING forEach()
        // =========================================================

        System.out.println("\nUsing forEach():");

        myList.forEach(n -> System.out.print(n + " "));

        System.out.println();


        // =========================================================
        // CHECKING IF LIST IS EMPTY
        // =========================================================

        System.out.println("\nIs myList empty?");
        System.out.println(myList.isEmpty());


        // =========================================================
        // COPYING ARRAYLIST
        // =========================================================

        ArrayList<Integer> copiedList = new ArrayList<>(myList);

        System.out.println("\nCopied list:");
        System.out.println(copiedList);


        // =========================================================
        // CONVERTING ARRAYLIST TO ARRAY
        // =========================================================

        Object[] normalArray = myList.toArray();

        System.out.println("\nArray from ArrayList:");

        for (Object x : normalArray) {
            System.out.print(x + " ");
        }

        System.out.println();


        // =========================================================
        // IMPORTANT NOTES
        // =========================================================

        /*
           1. ArrayList internally uses dynamic array.

           2. Access by index is fast: O(1)

           3. Insertion/deletion in middle is slower.

           4. ArrayList allows duplicates.

           5. ArrayList maintains insertion order.

           6. ArrayList is NOT synchronized.

           7. Primitive types are stored using Wrapper Classes:
                int -> Integer
                char -> Character
                double -> Double

           8. Reflection on JDK internal classes may require:

                --add-opens java.base/java.util=ALL-UNNAMED

              in newer Java versions.
        */


        // =========================================================
        // END
        // =========================================================

        System.out.println("\nProgram Completed.");
    }
}