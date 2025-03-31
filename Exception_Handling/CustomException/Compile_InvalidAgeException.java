package Exception_Handling.CustomException;


public class Compile_InvalidAgeException extends Exception{
    public Compile_InvalidAgeException(){}
    public Compile_InvalidAgeException(String str){
        super(str);
    }
}
