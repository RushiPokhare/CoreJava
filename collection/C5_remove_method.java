package collection;

import java.util.ArrayList;
import java.util.List;

public class C5_remove_method {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(200);
        list.add(50);
        list.add(90);
        list.add(89);
        System.out.println("Before Removal");
        System.out.println(list);

        System.out.println("After Remove");
        list.remove(0);
        System.out.println(list);
    }
}
