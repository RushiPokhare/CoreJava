package Exception_Handling;

public class CatchBlockException_withFinally3 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println(10/0);
        }finally {
            System.out.println("Finally Block");
        }
        System.out.println("Rest of the main");
    }
}
