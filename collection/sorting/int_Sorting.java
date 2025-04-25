package collection.sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class int_Sorting {
    public static void main(String[] args) {
        List list=new LinkedList<>();
        list.add(10);
        list.add(47);
        list.add(39);
        list.add(78);
        list.add(34);

//        For the sorting purpose we used the Collections.short(collection) method
        Collections.sort(list);
        System.out.println(list);
    }
}
