package multithreading;

public class M17_SetThreadName_setNameMethod {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            System.out.println("Current Thread Name is -->"+Thread.currentThread().getName());
        });   // Here we set the name through setName()
        thread.setName("Thread1");
        thread.start();
    }
}
