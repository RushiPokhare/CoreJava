package ExceptionHandling.CustomException;

//Runntime Default Exception---->RuntimeException
public class Runtime_InvalidAgeException extends RuntimeException{

    public Runtime_InvalidAgeException(){}  //Zero Para

    public Runtime_InvalidAgeException(String str){   //Para Cons
        super(str);
    }
}
