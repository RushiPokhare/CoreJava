package collection;

import java.util.Stack;

public class S20_Peek {
    public static void main(String[] args) {
        Stack books=new Stack();
        books.push("Shri Dattaguru Charitra");
        books.push("Mahabharata");
        books.push("Ramayana");
        books.push("Rich Dad Poor Dad");

        System.out.println("Picked element is --> "+books.peek());
    }
}
