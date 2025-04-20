package multithreading;

public class M16_DaemonThread {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            System.out.println("We set this thread1 as a Daemon Thread");
        },"thread1");

        thread1.setDaemon(true);
        thread1.start();
        boolean threadIs=thread1.isDaemon();
        System.out.println("Custom thread is Damon Thread --> "+threadIs);
        System.out.println("You are in main Thread --> "+Thread.currentThread().getName());
    }
}
