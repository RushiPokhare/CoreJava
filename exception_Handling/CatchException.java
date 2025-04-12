package exception_Handling;

public class CatchException {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
//catch block Exception always an abnormal termination of the program