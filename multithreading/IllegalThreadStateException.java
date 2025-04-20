package collection;

public class IllegalThreadStateException {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            System.out.println("This is a Custom Thread");
        },"Thread1");

        thread.start();
        thread.start();
    }
}
