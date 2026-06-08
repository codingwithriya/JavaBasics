package CollectionsDemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        // =========================================================
        // BASIC LINKED LIST CREATION
        // =========================================================

        LinkedList<Integer> list = new LinkedList<>();


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
        // ADDING ELEMENT AT SPECIFIC INDEX
        // =========================================================

        list.add(2, 100);

        System.out.println("\nAfter add(index, element):");
        System.out.println(list);


        // =========================================================
        // ADDING AT FIRST AND LAST
        // =========================================================

        list.addFirst(5);
        list.addLast(500);

        System.out.println("\nAfter addFirst() and addLast():");
        System.out.println(list);


        // =========================================================
        // ACCESSING ELEMENTS
        // =========================================================

        System.out.println("\nFirst Element:");
        System.out.println(list.getFirst());

        System.out.println("\nLast Element:");
        System.out.println(list.getLast());

        System.out.println("\nElement at index 3:");
        System.out.println(list.get(3));


        // =========================================================
        // UPDATING ELEMENT
        // =========================================================

        list.set(2, 999);

        System.out.println("\nAfter set():");
        System.out.println(list);


        // =========================================================
        // REMOVING ELEMENTS
        // =========================================================

        list.remove();

        System.out.println("\nAfter remove():");
        System.out.println(list);

        list.remove(2);

        System.out.println("\nAfter remove(index):");
        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println("\nAfter removeFirst() and removeLast():");
        System.out.println(list);


        // =========================================================
        // SIZE
        // =========================================================

        System.out.println("\nSize:");
        System.out.println(list.size());


        // =========================================================
        // SEARCHING
        // =========================================================

        System.out.println("\nContains 30?");
        System.out.println(list.contains(30));

        System.out.println("\nIndex of 30:");
        System.out.println(list.indexOf(30));


        // =========================================================
        // ITERATION USING ENHANCED FOR LOOP
        // =========================================================

        System.out.println("\nEnhanced For Loop:");

        for (Integer n : list) {
            System.out.print(n + " ");
        }

        System.out.println();


        // =========================================================
        // ITERATION USING NORMAL FOR LOOP
        // =========================================================

        System.out.println("\nNormal For Loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();


        // =========================================================
        // forEach()
        // =========================================================

        System.out.println("\nforEach:");

        list.forEach(x -> System.out.print(x + " "));

        System.out.println();


        // =========================================================
        // addAll()
        // =========================================================

        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(1000);
        list2.add(2000);
        list2.add(3000);

        list.addAll(list2);

        System.out.println("\nAfter addAll():");
        System.out.println(list);


        // =========================================================
        // addAll(index, collection)
        // =========================================================

        LinkedList<Integer> extra = new LinkedList<>();

        extra.add(111);
        extra.add(222);

        list.addAll(1, extra);

        System.out.println("\nAfter addAll(index, collection):");
        System.out.println(list);


        // =========================================================
        // COPY LINKEDLIST
        // =========================================================

        LinkedList<Integer> copiedList =
                new LinkedList<>(list);

        System.out.println("\nCopied List:");
        System.out.println(copiedList);


        // =========================================================
        // CREATE FROM ANOTHER COLLECTION
        // =========================================================

        List<Integer> numbers =
                Arrays.asList(7, 8, 9, 10);

        LinkedList<Integer> fromCollection =
                new LinkedList<>(numbers);

        System.out.println("\nCreated From Collection:");
        System.out.println(fromCollection);


        // =========================================================
        // QUEUE OPERATIONS
        // =========================================================

        LinkedList<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("\nQueue:");
        System.out.println(queue);

        System.out.println("peek(): " + queue.peek());

        System.out.println("poll(): " + queue.poll());

        System.out.println(queue);


        // =========================================================
        // STACK OPERATIONS
        // =========================================================

        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack:");
        System.out.println(stack);

        System.out.println("pop(): " + stack.pop());

        System.out.println(stack);


        // =========================================================
        // DEQUE OPERATIONS
        // =========================================================

        LinkedList<Integer> deque = new LinkedList<>();

        deque.offerFirst(100);
        deque.offerLast(200);
        deque.offerFirst(50);
        deque.offerLast(300);

        System.out.println("\nDeque:");
        System.out.println(deque);

        System.out.println("pollFirst(): "
                + deque.pollFirst());

        System.out.println("pollLast(): "
                + deque.pollLast());

        System.out.println(deque);


        // =========================================================
        // CONVERT TO ARRAY
        // =========================================================

        Object[] arr = list.toArray();

        System.out.println("\nArray:");

        for (Object x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();


        // =========================================================
        // CLEAR
        // =========================================================

        LinkedList<Integer> temp = new LinkedList<>();

        temp.add(1);
        temp.add(2);
        temp.add(3);

        System.out.println("\nBefore clear:");
        System.out.println(temp);

        temp.clear();

        System.out.println("After clear:");
        System.out.println(temp);


        // =========================================================
        // IMPORTANT NOTES
        // =========================================================

        /*
         * LinkedList internally uses Doubly Linked List.
         *
         * Each node contains:
         *
         * [prev | data | next]
         *
         * Advantages:
         * - Fast insertion/deletion at beginning/end.
         * - No resizing required.
         *
         * Disadvantages:
         * - More memory usage.
         * - Random access is slow.
         *
         * ArrayList:
         *      get(index) -> O(1)
         *
         * LinkedList:
         *      get(index) -> O(n)
         *
         * LinkedList implements:
         *      List
         *      Queue
         *      Deque
         *
         * Therefore it can behave as:
         *      List
         *      Queue
         *      Stack
         *      Deque
         */


        System.out.println("\nProgram Completed.");
    }
}