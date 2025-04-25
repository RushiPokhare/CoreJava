package collection.list_Impl;

import java.util.LinkedList;

public class C14_LinkedList {
    public static void main(String[] args) {
//        homo & Hetero ,null,duplicates,IO maintained
        LinkedList linkedList=new LinkedList<>();
        linkedList.add(2);
        linkedList.add("Rushi");
        linkedList.add("Rushi");
        linkedList.add(20.0f);
        linkedList.add(null);
        linkedList.add(null);

        System.out.println(linkedList);
    }
}
