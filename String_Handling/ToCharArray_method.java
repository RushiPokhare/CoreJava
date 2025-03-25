package String_Handling;

public class ToCharArray_method {
    public static void main(String[] args) {
        String str=new String("Rushikesh Pokhare");
        char[] array=str.toCharArray(   );
        for (char ch:array){
            System.out.println(ch);
        }
    }
}
