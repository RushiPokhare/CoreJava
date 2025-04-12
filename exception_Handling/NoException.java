package exception_Handling;

public class NoException {
    public static void main(String[] args) {
        try{
            System.out.println(10/2);
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }
        System.out.println("Rest of the main");
    }
}
//Line no 6--> prints 10/2-->10  because here is no any exception and control goes line no 7.
//line no 7--> here is an exception control goes to corresponding catch block.
//Finally prints the Rest of the main code.