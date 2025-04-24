package collection;

import java.util.Stack;

public class S21_Size {
    public static void main(String[] args) {
        Stack books=new Stack();
        books.push("Shri Dattaguru Charitra");
        books.push("Mahabharata");
        books.push("Ramayana");
        books.push("Rich Dad Poor Dad");

        System.out.println("Stack is empty-->"+books.isEmpty());
    }
}
