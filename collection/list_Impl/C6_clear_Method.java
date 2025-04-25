package collection.list_Impl;

import java.util.ArrayList;
import java.util.List;

public class C6_clear_Method {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(200);
        list.add(50);
        list.add(90);
        list.add(89);
        System.out.println("Before Removal "+"\t"+"Size -->"+list.size());
        System.out.println(list);

        list.clear();  //clear all the element
        System.out.println("After Remove"+"\t"+"Size -->"+list.size());
        System.out.println(list);
    }
}
