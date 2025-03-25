package String_Handling;

public class toString_Method {
    public static void main(String[] args) {
//        toString Method is overridden that prints the content of String....Not Print Hexadecimal HashCode
        String s1="acb";
        String s2=new String("XYZ");
        String s3="PQR";

        System.out.println(s1.toString());
        System.out.println(s1);
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
