package collection;

import java.util.Stack;

public class S19_PUSH {
    public static void main(String[] args) {
        Stack books=new Stack();
        books.push("Shri Dattaguru Charitra");
        books.push("Mahabharata");
        books.push("Ramayana");
        books.push("Rich Dad Poor Dad");

        System.out.println("before push -->"+books);

        books.push("Shivchatritra");

        System.out.println("after push -->"+books);

    }
}
