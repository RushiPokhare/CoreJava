package collection;

import java.util.ArrayList;
import java.util.List;

public class C3_add_addAll_Mathod {
    public static void main(String[] args) {
        List list1=new ArrayList();

//        ADD METHOD
        list1.add("sai");
        list1.add(10);
        list1.add(2000);

        List list2=new ArrayList();

//        ADDALL METHOD
        list2.addAll(list2);
    }
}
