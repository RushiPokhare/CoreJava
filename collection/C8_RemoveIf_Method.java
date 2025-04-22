package collection;

import java.util.ArrayList;

public class C8_RemoveIf_Method {
    public static void main(String[] args) {
        ArrayList<String> candidateList=new ArrayList<>();
        candidateList.add("Rudra");
        candidateList.add("Sahil");
        candidateList.add("Jhon");
        candidateList.add("Sachin");
        candidateList.add("Sunil");
        System.out.println("Candidates -->"+candidateList);

        candidateList.removeIf(name->name.startsWith("S"));

        System.out.println("After removing candidates who's name start with S -->"+candidateList);
    }
}
