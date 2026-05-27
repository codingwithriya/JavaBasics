@FunctionalInterface
interface A{
    public void show(int n);
}
//Anonymous class usage, without creating a separate class we create an object for overriding the superclass
public class Lambda {
    public static void main(String[] args) {

//        without lambda function
        A obj = new A()
        {
            @Override
            public void show(int n){
                System.out.println("in Show of Main" + n);
            }
        };

        obj.show(10);

//        With lambda function
        A obj2 = (int n) -> System.out.println("In lambda"+ n);
        obj2.show(5);

    }
}
