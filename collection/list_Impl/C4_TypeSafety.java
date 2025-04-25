package collection.list_Impl;

import java.util.ArrayList;
import java.util.List;


public class C4_TypeSafety {
    public static void main(String[] args) {
//        Generic <-- Type Safety, allow to store INTEGER type data
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
//        list.add("Rushi");  <-- CTE
        System.out.println(list);
    }
}
