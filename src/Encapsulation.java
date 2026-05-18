public class Encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human();
//      String name = h1.name;    not possible, abstraction
        h1.setName("Riya");
        h1.setAge(20);
        System.out.printf("name: %s, age: %d",h1.getName(),h1.getAge());
    }
}
class Human{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
