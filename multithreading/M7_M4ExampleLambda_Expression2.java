package multithreading;

public class M7_M4ExampleLambda_Expression2 {
    public static void main(String[] args) {
//Lambda Expression
        Thread thread=new Thread(() -> System.out.println("Run Method --> "+Thread.currentThread().getName()),"worker"); //Give work and NAME
        thread.setName("Worker");
        thread.start();
        System.out.println("Main Method -->"+Thread.currentThread().getName());
    }
}
