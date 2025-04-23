package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

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

 //    5.Using JAVA 8 forEach method
            System.out.println("Using JAVA 8 forEach method");
            Consumer consumer=input-> System.out.println(input);
            list.forEach(consumer);

//      6.Using forEach---> Method Reference
            System.out.println("using Method Refrance");
            list.forEach((Consumer)System.out::println);

//      7. Using Iterator
            System.out.println("Using Iterator --> ");
            Iterator<String> iterator = list.iterator(); //iterator methods returns tur or false
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

//      8. List Iterator
            System.out.println("Reading the element using the list Iterator -->");
            ListIterator<String> stringListIterator = list.listIterator();
            while (stringListIterator.hasNext()){
                System.out.println(stringListIterator.next());
            }
        }
    }
}
