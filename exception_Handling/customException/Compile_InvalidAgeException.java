package exception_Handling.customException;


public class Compile_InvalidAgeException extends Exception{
    public Compile_InvalidAgeException(){}
    public Compile_InvalidAgeException(String str){
        super(str);
    }
}
