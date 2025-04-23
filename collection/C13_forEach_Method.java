package collection;

import java.util.ArrayList;
import java.util.function.Consumer;

public class C13_forEach_Method {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Rudra");
        arrayList.add("Sahil");
        arrayList.add("Jhon");
        arrayList.add("Sachin");
        arrayList.add("Sunil");
        System.out.println("Using JAVA 8 forEach method");
        Consumer consumer= input-> System.out.println(input);
        arrayList.forEach(consumer);
    }
}
