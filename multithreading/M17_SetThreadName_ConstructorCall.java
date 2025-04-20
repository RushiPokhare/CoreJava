package multithreading;

public class M17_SetThreadName_ConstructorCall {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            System.out.println("Current Thread Name is -->"+Thread.currentThread().getName());
        },"Thread1");   // Here we set the name through Constructor call
        thread.start();
    }
}
