package collection.list_Impl;

import java.util.Stack;

public class S22_Search {
    public static void main(String[] args) {
        Stack books=new Stack();
        books.push("Shri Dattaguru Charitra");
        books.push("Mahabharata");
        books.push("Ramayana");
        books.push("Rich Dad Poor Dad");

        System.out.println("search element at the position of :"+books.search("Ramayana"));
    }
}
