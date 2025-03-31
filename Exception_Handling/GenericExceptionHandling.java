package Exception_Handling;

public class GenericExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Throws ArithmeticException
            System.out.println(result);
        } catch (Exception e) {  // Catches any exception
            System.out.println("Something went wrong: " + e);
        }
        System.out.println("Rest of the code");
    }
}
