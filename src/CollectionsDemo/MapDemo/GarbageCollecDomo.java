package CollectionsDemo.MapDemo;

import java.lang.ref.WeakReference;

public class GarbageCollecDomo {


    public static void main(String[] args) {
        Phone p1 = new Phone("Samsung", "S24");  // Strong Reference
        System.out.println(p1);
        p1 = null;
        System.out.println(p1);
//        here p1 is set to null thus the object that was created is now left in the memory with no pointer thus it is a garbage value that will be destroyed by garbage collector in jvm

        //Weak referencing :

        WeakReference<Phone> wr1 = new WeakReference<>(new Phone("Samsung", "S24"));  // Strong Reference
        System.out.println(wr1.get());
        // we call gc here, as we have a weak reference here, so jvm understands that this is not required.
        System.gc();
        try{
            Thread.sleep(10000);
        }catch (Exception ignored){
        }
        System.out.println(wr1.get()); //this will bw printed as null as gc() is called


    }
}

class Phone{
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
