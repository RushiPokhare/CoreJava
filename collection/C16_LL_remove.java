package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C16_LL_remove {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(200);
        list.add(50);
        list.add(90);
        list.add(89);
        System.out.println("Before Removal -->"+list);
        System.out.println("2th index element is removed -->"+list.remove(2));
        System.out.println("After Removal -->"+list);
    }
}
