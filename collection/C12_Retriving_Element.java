package collection;

import java.util.ArrayList;
import java.util.List;

public class C12_Retriving_Element {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Rudra");
        list.add("Sahil");
        list.add("Jhon");
        list.add("Sachin");
        list.add("Sunil");

//        1.Complete print the list
        System.out.println("Direct Print --> ");
        System.out.println(list);

//        2.Single Element access using index
        System.out.println("Using .get, .getLast and .getFirst method --> ");
        System.out.println("Element Present at Index 0th -->"+list.get(1));
        System.out.println("Getting last Element -->"+list.getLast());
        System.out.println("Getting first Element -->"+list.getFirst());

//        3.Multiple Values -->Traditional for loop
        System.out.println("Traditional for loop --> ");
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

//        4.Enhance for Loop
        System.out.println("Enhance for Loop --> ");
        for (String temp:list){
            System.out.println(temp);
        }
    }
}
