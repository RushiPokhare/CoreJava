package ExceptionHandling.CustomException;

import java.util.Scanner;

public class Use_InvalidIndexException {
    public static void main(String[] args) {
        System.out.println("Enter Your Age:");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();

        if(age<18){
//            Using this line we genrate Problem or Exception
            throw new Compile_InvalidAgeException("Invalid age");
//            it gives an error because of this is a compile time Exception, if we Create a Runntime the error will be removed.
        }
        System.out.println("You allow to vote");
    }
}
