package multithreading;

public class IllegalThreadStateException {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            System.out.println("This is a Custom Thread");
        },"Thread1");

        // when we start one thread two times we get IllegalThreadStateException
        thread.start();
        thread.start();
    }
}
