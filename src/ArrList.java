import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(20);
        myList.add(10);
        myList.add(30);
        myList.add(80);
        myList.add(390);

//        enhanced for loop:
        System.out.println("Elements in list are:");
        for (int n : myList){
            System.out.println(n + ",");
        }
        myList.remove(2);
        myList.add(2,40);
        System.out.println(myList);
        myList.set(2,100);
        System.out.println(myList);
    }
}
