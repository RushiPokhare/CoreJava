package collection.sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class String_Sorting {
    public static void main(String[] args) {
        List list=new LinkedList<>();
        list.add("SAI");
        list.add("Krushna");
        list.add("Swami");

        Collections.sort(list);
        System.out.println("Sorted List is "+list);
    }
}
