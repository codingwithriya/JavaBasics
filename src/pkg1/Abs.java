package pkg1;

public abstract class Abs {
    public abstract void show();
}
class Bs extends Abs{
    @Override
    public void show(){
        System.out.println("Overriding Abs");
    }
}
class Main{
    public static void main(String[] args) {

        Bs obj = new Bs();
        obj.show();
    }
}
