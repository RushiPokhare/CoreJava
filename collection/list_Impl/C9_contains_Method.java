package collection.list_Impl;

import java.util.ArrayList;

public class C9_contains_Method {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();

        arrayList.add("sai");
        arrayList.add("Rudra");
        arrayList.add("sujal");
        arrayList.add("sahil");

        System.out.println("is Rudra is present in the List :"+arrayList.contains("Rudra"));

    }
}
