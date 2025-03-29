package String_Handling.stringBuffer_StringBuilder;

public class Equal_Hashcode_Methods {
    public static void main(String[] args) {
        String string1=new String("abc");
        String string2=new String("XYZ");
//it returns FALSE because StringBuffer& StringBuilder not overridden equal & Hashcode Mathod  it not check the content it check the refrance.
        System.out.println(string1.equals(string2));  //false
    }
}
