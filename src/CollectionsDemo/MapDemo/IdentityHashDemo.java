package CollectionsDemo.MapDemo;

public class IdentityHashDemo {
    public static void main(String[] args) {


        String n1 = "Riya";
        String n2 = "Riya";
        System.out.println(n1==n2);   //should come true checks same pointed objects from mem location
        System.out.println(n1.equals(n2));  //should come true, checks  string or value inside the object
//        System.out.println(n1.toUpperCase() == n2.toUpperCase());  //should come false, we need true ideally, as it checks same pointed objects from mem location not the actual value of the objects
        System.out.println(n1.toUpperCase().equals(n2.toUpperCase())); //should come true as it is checking the value
    }
}
