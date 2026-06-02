import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class CompareStringByLength implements Comparator<String>{
    public int compare (String s1, String s2){
        return s2.compareTo(s1);
    }
}

class NumCompare implements Comparator<Integer>{
    public int compare (Integer n1, Integer n2){
        return n2 - n1;
    }
}

class Students{
    public String name;
    public double cgpa;

    public Students(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}


public class Comp {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(5);
        l1.add(2);
        l1.add(7);

        l1.sort(null);
        System.out.println(l1);

        List<String> l2 = Arrays.asList("Pineapple","Mangoes", "Apple");
        l2.sort(null);
        System.out.println(l2);


        // Now to implement our own customized comparator, create customized class implementing comparator class
        l1.sort(new NumCompare());
        System.out.println(l1);
        l2.sort(new CompareStringByLength());
        System.out.println(l2);

        l2.sort((a,b) ->a.length() - b.length());
        System.out.println(l2);

        // Accessing student class...
        List<Students> s = new ArrayList<>();


        s.add (new Students("ASam", 98.5));
        s.add (new Students("Btim", 92.5));
        s.add (new Students("Ejohn", 72.5));
        s.add (new Students("Cwales", 70.0));
        s.add (new Students("DTins", 80.5));

        for (Students ss : s){
            System.out.println(ss.getName() + " : " + ss.getCgpa());
        }

        s.sort((o1,o2) -> (int) (o2.getCgpa() - o1.getCgpa()));

        System.out.println("\n \n=========== \nAfter sorting in descending order");

        for (Students ss : s){
            System.out.println(ss.getName() + " : " + ss.getCgpa());
        }
        s.sort((o1,o2) -> (int) (o1.getName().compareTo(o2.getName())));

        System.out.println("\n \n=========== \nAfter sorting in descending order by name");

        for (Students ss : s){
            System.out.println(ss.getName() + " : " + ss.getCgpa());
        }


    }
}
