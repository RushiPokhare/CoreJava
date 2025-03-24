package String_Handling;

public class Comparison {
    public static void main(String[] args) {
        String s1= new String("abc");
        String s2="abc";
        String s3="abc";

        System.out.println("1. Comparison Using  == Operator");
        System.out.println(s1==s2); //false
        System.out.println(s2==s3); //true
        System.out.println(s1==s3); //false

        System.out.println("2. Comparison Using  equals() method");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s2.equals(s3)); //true
        System.out.println(s1.equals(s3)); //true

        String x1="ABC";
        String x2="abc";
        String x3="Abc";

        System.out.println("3. Comparison using equalsIgnoreCase() method");
        System.out.println(x1.equalsIgnoreCase(x2)); //true
        System.out.println(x1.equalsIgnoreCase(x3)); //true
        System.out.println(x2.equalsIgnoreCase(x3)); //true


        String a1="A";
        String a2="B";
        String a3="C";
        System.out.println("4. Comparison Using compareTo() method");
        System.out.println(a1.compareTo(a2)); //65-66 = -1
        System.out.println(a2.compareTo(a3));//66-67 = -1
        System.out.println(a3.compareTo(a1));//67-65 = 2

    }
}
