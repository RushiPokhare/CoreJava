package exception_Handling;
// Refer NoteBook ---> Session 2
public class CatchBlockException2 {
    public static void main(String[] args) {
       try {
           try {
               System.out.println(10 / 0);
           } catch (ArithmeticException ae) {
               System.out.println("inner Catch");
               System.out.println(10/0);   //---> We Write the exception in the Catch block
           }
           System.out.println("Rest of the main-->outer try");
       }catch(ArithmeticException ae){
           System.out.println("outer catch");
           System.out.println(10/0);
       }
        System.out.println("Rest of the main");
    }
}
//output-->
//          inner catch
//          outer catch
//          Arithmetic Exception