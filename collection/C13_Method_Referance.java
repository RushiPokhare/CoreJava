package collection;

import java.util.ArrayList;
import java.util.function.Consumer;

public class C13_Method_Referance {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Rudra");
        arrayList.add("Sahil");
        arrayList.add("Jhon");

        arrayList.forEach((Consumer)System.out::println);
    }
}
