package CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

//        LIFO principle (Last In First Out)
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println("The stack is ::" + st);
        System.out.println("The top element of the stack is ::" + st.peek());
        System.out.println("Is the stack empty ::" + st.isEmpty());
        System.out.println("Removing the top element of the stack that is ::" + st.pop());
        System.out.println();
        System.out.println("After removal ---- The stack is ::" + st);

        System.out.println(" Searching the element 50 at pos:" + st.search(50)); // Counting from Top to Bottom, top most element's pos is 1
        System.out.println(" Searching the element 10 at pos:" + st.search(10)); // Counting from Top to Bottom, top most element's pos is 5(last)


//        We can perform multiple operations here, like add in a position or removal from a particular position.
//        That is not the natural behavior of a Stack, but it is possible because Stack internally extends Vector.

//        TODO : Implement Stack using Linked List

//        LinkedList can also be used as a Stack.
//        We insert and remove elements from the beginning (or end) to maintain LIFO behaviour.

        LinkedList<Integer> ll = new LinkedList<>();

        ll.push(10);
        ll.push(20);
        ll.push(30);

        System.out.println("\nLinkedList as Stack :: " + ll);
        System.out.println("Top Element :: " + ll.peek());
        System.out.println("Removed Element :: " + ll.pop());
        System.out.println("After Pop :: " + ll);


//        TODO : Implement Stack using ArrayList

//        ArrayList does not provide push(), pop(), or peek() methods.
//        We manually perform stack operations using the last index.

        ArrayList<Integer> al = new ArrayList<>();

        // Push Operation
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println("\nArrayList as Stack :: " + al);

        // Peek Operation
        System.out.println("Top Element :: " + al.get(al.size() - 1));

        // Pop Operation
        System.out.println("Removed Element :: " + al.remove(al.size() - 1));

        System.out.println("After Pop :: " + al);

        // Stack extends Vector.
        // Therefore all Vector methods (add, remove, insert, etc.) are available in Stack.

        // LinkedList already provides push(), pop() and peek() methods,
        // making it a natural alternative implementation of a Stack.

        // ArrayList can also be used as a Stack by treating the last element
        // as the "top" of the stack.
    }
}