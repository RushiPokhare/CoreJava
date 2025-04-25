package collection.list_Impl;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList {
    public static void main(String[] args) {
        List list=new ArrayList<>();
//        We can store Homogenous and heterogeneous data in ArrayList
//        we can store multiple NULL values
//        we can store multiple DUPLICATE values
//        Insertion order maintain
        list.add(10);
        list.add(true);
        list.add("Sai");
        list.add("Sai");
        list.add(null);
        list.add(10.10f);
        System.out.println(list); // Here Behind the sense list.toString() <-- Overridden method that print the actual contains
//        System.out.println(list.toString());
        System.out.println("length is ->"+list.size());
    }
}
