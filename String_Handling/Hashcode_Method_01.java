package String_Handling;

public class Hashcode_Method_01 {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2=new String("abc");
        String s3=new String("abc");
        String s4=new String("abc");

        System.out.println("Hashcode method is overridden and generate hashcode based on content");
        System.out.println(s1.hashCode()); //96354
        System.out.println(s2.hashCode()); //96354
        System.out.println(s3.hashCode()); //96354
        System.out.println(s4.hashCode()); //96354

        System.out.println("Hashcode based on memory address ");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

    }
}
