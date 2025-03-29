package ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            System.out.println("Rest of the code"); //<---- Don't Be Executed, Because of First line gives the Exception
        } catch (ArithmeticException e) {
            System.out.println("Invalid Denominator");
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("Rest of the Program");
    }
}
//OutPut IS ------>
                // Invalid Denominator
                // Finally Block
                // Rest of the Program