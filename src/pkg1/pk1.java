package pkg1;

public class pk1 {
    public static void main(String[] args) {
        System.out.println("i am inside package pkg1");
        B obj = new B();
        obj.add(5,5);
        A obj1 = new A();
        obj.add(5,5);
    }
}

class A{
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class B extends A{
    @Override
    public void add(int a, int b){
        System.out.println("Overriding "+(a+b+5));
    }
}