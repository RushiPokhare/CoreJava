package collection.list_Impl;

import java.util.LinkedList;
import java.util.List;

public class C15_LL_addAll {
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(5);

        List list2=new LinkedList();
        list2.add(120);
        list2.add(500);

        System.out.println("Added Success -->"+list.addAll(list2));
        System.out.println(list);
    }
}
