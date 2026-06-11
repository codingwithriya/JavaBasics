package CollectionsDemo.MapDemo;

import javax.swing.*;
import java.awt.*;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String , Image> whm1 = new WeakHashMap<>();

        whm1.put(new String("img1"), new Image("Image1"));
        whm1.put(new String("img1"), new Image("Image2"));
        System.out.println(whm1);
        System.gc();


        new WeakHashMapDemo().simulate();
        System.out.println(whm1);



    }

    public void simulate(){
        try {
            Thread.sleep(1000);
        }catch (Exception ignored){}
    }
}
class Image{
    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}