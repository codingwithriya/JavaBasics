package CollectionsDemo.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEquals {
    public static void main(String[] args) {


//        HashMap<String,Integer> m1 = new HashMap<>();
//        m1.put ("Tom",15);
//        m1.put ("Tom",20);    Here both the keys are same so its value is getting updated
//
//        System.out.println("===> TESTING" + m1);


        HashMap<Student, Integer> std = new HashMap<>();
        Student s1 = new Student("Ram", 1);
        Student s2 = new Student("Shyam", 4);
        Student s5 = new Student("Shyam", 4);
        Student s3 = new Student("Rina", 2);

//        In this eg as well the key for s2 and s5 are same, so when we are putting s2 as 90 and s5 to 95 it should update the same key as the student s2 and s5 are same
        std.put(s1, 95);
        std.put(s2, 90);
        std.put(s3, 93);
        std.put(s5, 98);

        System.out.println("Testing Student:: "+std.toString());  // This will now print 2 Shyam, for s1 and s2 differently, as they have generated different hash code and are kept in two different index. Now to do the equality check we have to override the equals method that do not check the hashcode of the entities instead that will check the equality of the keys.

//        So previously it was doing
//        System.out.println(s2.hashCode());
//        System.out.println(s5.hashCode());
//        which internally uses the object equal method, that says that s2 and s5 are 2 different objects in different memory so returns 2 diff hash code for the same.
//        Different objects → different hash codes.
//        but now we override the objects equals method to check if both the id and the name are same then those 2 objects should be treated as the same object.

        System.out.println("Marks or value of s2 is : " + std.get(s2));
        System.out.println("Marks or value of s5 is : " + std.get(s5));

    }
}
class Student{
    String name;
    int id;

    public Student (String name, int id){
        this.name = name;
        this.id = id;
    }

//        checking the equality of the objects
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}