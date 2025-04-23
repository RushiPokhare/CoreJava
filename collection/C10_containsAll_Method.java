package collection;

import java.util.ArrayList;

public class C10_containsAll_Method {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();

        arrayList.add("sai");
        arrayList.add("Rudra");
        arrayList.add("sujal");
        arrayList.add("sahil");

        ArrayList<String> arrayList1=new ArrayList<>();

        arrayList1.add("sujal");
        arrayList1.add("sahil");

        System.out.println("Given name is present in the list -->"+arrayList.containsAll(arrayList1));

    }
}
