package collection.sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class intShorting_Consumer {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(50);
        list.add(67);
        list.add(33);

        Collections.sort(list);
        Consumer<? super Integer> consumer=x->System.out.println(x);//Using Lambda
        Consumer<? super Integer> consumer1=System.out::println;//Using Method Referance
        System.out.println("Using Lambda");
        list.forEach(consumer);
        System.out.println("Using Method Ref");
        list.forEach(consumer);
    }

}
