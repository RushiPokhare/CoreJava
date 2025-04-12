package exception_Handling;

public class TwoLineExceptionTry {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            String str = null;
            int length = str.length();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer error: " + e.getMessage());
        }

    }
}
//Output --> Arithmetic error: / by zero
//control never go to line no 8