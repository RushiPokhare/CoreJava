package ExceptionHandling.throws_keyword;

//This is a so much stuff  i need to handle the error to who write the program.....-->Check Demo2
public class NormalMethod {
    private static int division(int number1, int number2) {
                int quotient=0;
                        try{
                             quotient=number1/number2;
                        } catch (ArithmeticException e) {
                            System.out.println("invalid Denominator");
                        }
                        return quotient;
                         }
    public static void main(String[] args) {
        System.out.println(division(10,0));
        System.out.println("Rest of the main");
    }
}
