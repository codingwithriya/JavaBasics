//Implementing Anonymous
class Ano{
    public void show(){
        System.out.println("in Show of Ano");
    }
    public void me(){
        System.out.println("Trying to see if this works");
    }
}
//Anonymous class usage, without creating a separate class we create an object for overriding the superclass
public class Anonymous {
    public static void main(String[] args) {
        Ano obj = new Ano()
        {
            @Override
            public void show(){
                System.out.println("in Show of Main");
            }
            @Override
            public void me(){
                System.out.println("in Me of Main");
            }
        };
        obj.show();
        obj.me();
    }
}
