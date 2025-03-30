package ExceptionHandling.throws_keyword;


public class UncheckedException_throws {
    //    Exception Handled in the caller method ---> No need to write throws keyword
//    Automatically transfer to the caller method

    private static int division(int number1, int number2) {
        return number1 / number2;
    }

    public static void main(String[] args) {
        try {
            System.out.println(UncheckedException_throws.division(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception ");
            System.out.println("Exception handled in method");
        }
        System.out.println("Rest of the main");
    }
}
