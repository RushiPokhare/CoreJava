package multithreading;

public class M6_M4ExampleLambda_Expression {
    public static void main(String[] args) {
//Lambda Expression
        Runnable runnable=() -> System.out.println("Run Method --> "+Thread.currentThread().getName());
        Thread thread=new Thread(runnable);
        thread.setName("Worker");
        thread.start();
        System.out.println("Main Method -->"+Thread.currentThread().getName());
    }
}
