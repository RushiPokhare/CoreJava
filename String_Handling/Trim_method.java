package String_Handling;

public class Trim_method {
    public static void main(String[] args) {
        String str=new String("             Aniket                 ");
//        this method Remove the White Spaces from the Beginning and End
        str=str.trim();
        System.out.println(str);
    }
}
