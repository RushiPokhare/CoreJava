package String_Handling.stringBuffer_StringBuilder;

public class ConvertStringInto_Buffer_Builder {
    public static void main(String[] args) {
        String str="Rushi";
        System.out.println("1.Convert String into StringBuffer");
        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

        System.out.println("2. Converting String into StringBuilder");
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.append("Pokhare"));
    }

}
