package ExceptionHandling;

public class InnerTry {
    public static void main(String[] args) {
        try{
           try {
               System.out.println(10/0);
           }catch (ArithmeticException ae){
               System.out.println("inner catch Block");
           }
            System.out.println("outer try block");
        }catch (ArithmeticException ae){
            System.out.println("outer catch Block");
        }
        System.out.println("Rest of the main");
    }
}
//output --> inner catch block
//           outer try block
//           Rest of the main

//Explanation -->outer catch Block not printed because of..exception 10/2 is handle in inner catch block...