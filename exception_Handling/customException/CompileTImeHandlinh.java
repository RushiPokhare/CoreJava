package exception_Handling.customException;

import java.util.Scanner;

public class CompileTImeHandlinh {
    public static void main(String[] args) {
        System.out.println("Enter Your Age:");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();

//        if(age<18){
////            Using this line we genrate Problem or Exception
//            throw new Compile_InvalidAgeException("Invalid age");
//// ***  IF YOU WANT TO HANDLE SIMPLE USE TRY-CATCH OR THROWS
////            it gives an error because of this is a compile time Exception, if we Create a Runntime the error will be removed.
//        }
//        System.out.println("You allow to vote");



//      ---->> AFTER HANDLING  USING TRY-CATCH
        if(age<18) {
            try {
                throw new Compile_InvalidAgeException("Invalid age");
            } catch (Compile_InvalidAgeException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("You allow to vote");


    }
}
