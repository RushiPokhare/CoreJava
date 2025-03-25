package String_Handling;

public class concat_Method {
    public static void main(String[] args) {
        String s1="abc ";
        s1.concat("xyz");
        System.out.println(s1);//abc

        String s2=new String ("PQR ");
        s2=s2.concat("XYZ");
        System.out.println(s2);//PQRXYZ
    }
}
