package ExceptionHandling;

import java.sql.SQLOutput;

public class StringException {
    public static void main(String[] args) {
        String str="";
        try{
            System.out.println(str.charAt(0));
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception");
        }
        System.out.println("Rest of the main");
    }
}
//OutPut IS ------>
                    //Array index out of Bound  ---> and Terminate the Program
