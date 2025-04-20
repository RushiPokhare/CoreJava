package multithreading;

public class M15_ThreadPriority {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            System.out.println("This is a Custom Thread");
        },"thread1");

        thread.start();
        thread.setPriority(10);  //for setting the thread priority
        int priority=thread.getPriority();
        System.out.println(priority); //for getting the thread priority
    }
}
