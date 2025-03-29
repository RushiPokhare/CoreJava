package String_Handling.stringBuffer_StringBuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Good");
        sb.append("Morning");
//        it can be change existing object
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0,5);
        System.out.println(sb);

    }
}
