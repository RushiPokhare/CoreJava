package Exception_Handling.CustomException;

import java.util.Scanner;

public class RunTimeHandling {
    public static void main(String[] args) {
        System.out.println("Enter Your Age:");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();

        if(age<18){
//            Using this line we genrate Problem or Exception
            throw new Runtime_InvalidAgeException("Invalid age");
        }
        System.out.println("You allow to vote");
    }
}
