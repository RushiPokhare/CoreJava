package collection.setImpl;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set set=new HashSet<>();
        set.add(50);
//        Duplicate no allowed it will not be printed
//        Only one null value
//        Insertion order maintained
        set.add(50);
        set.add("Sai");
        set.add(60.0F);
        set.add("null");

        System.out.println("Set -->"+set);
    }
}
