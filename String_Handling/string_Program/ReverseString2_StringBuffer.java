package String_Handling.string_Program;
//reverse by reverse method of StringBuffer class
public class ReverseString2_StringBuffer {
    public static void main(String[] args) {
        String str="Rushikesh Santosh Pokhare";
        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
    }
}
