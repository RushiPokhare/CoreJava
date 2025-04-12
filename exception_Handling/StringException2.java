package exception_Handling;

public class StringException2 {
    public static void main(String[] args) {
        String str="";
        try{
            System.out.println(str.charAt(0));
            System.out.println(10/0);   //Never Execute
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("invalid String Index");
        }
        System.out.println("Rest of the main");
    }
}
//OutPut IS ------>
                    //invalid String Index
                    //Rest of the main
                    //

