package Exception_Handling;

public class TryFinally {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.out.println("Rest of the Statement in try");
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("Rest of the code");
    }
}

//OutPut IS ------>
                    // Finally Block
                    // Arithmatic Exception

//Rest of the code<--- not be printed the Defalut Exception handler print the exception and immideatily terminate the program..

//Because here is automatic default Handler doing there work  -->Check in notebook