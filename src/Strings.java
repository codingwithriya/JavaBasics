public class Strings {
    public static void main(String[] args){
        String name = "Riya";
        System.out.println(name);
        String mane = "Riya";
        System.out.println(mane == name); //will return true as they refer to same object, mane and name are just 2 references and not different objects

        name = "Riya Ghosh";
        System.out.println(name); // now this name refers to a different object and not the previous one, as String sre immutable

        // String buffer (mutable Sting)
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //gives us a default buffer space of 16bits
        System.out.println(sb.length()); // give the length, now nothing so 0bits, so length and capacity are 2 diff func.
//        sb = "Riya";  not possible, we are not creating a new object, we are just adding to it, so we need to use append()
        sb = sb.append("Riya");
        System.out.println(sb.length());  // should return 4
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.replace(0,1,"D"));

    }
}
