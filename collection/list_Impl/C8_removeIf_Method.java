package collection.list_Impl;

import java.util.ArrayList;

public class C8_removeIf_Method {
    public static void main(String[] args) {
        ArrayList<String> candidateList=new ArrayList<>();
        candidateList.add("Rudra");
        candidateList.add("Sahil");
        candidateList.add("Jhon");
        candidateList.add("Sachin");
        candidateList.add("Sunil");
        System.out.println("Candidates -->"+candidateList);

        candidateList.removeIf(name->name.startsWith("S"));

/*      The removeIf method (return boolean) is a convenient method available in Java's Collection interface (such as ArrayList, HashSet, etc.)
to remove elements that match a specific condition (predicate). It was introduced in Java 8

        1.Removing nulls from a list:
            list.removeIf(Objects::isNull);

        2. Removing items based on length:
            list.removeIf(str -> str.length() < 3);*/

        System.out.println("After removing candidates who's name start with S -->"+candidateList);
    }
}
