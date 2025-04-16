package multithreading;

public class M4_CreateThread_RunnableInterface {
    public static void main(String[] args) {
        class Worker implements Runnable{
            @Override
            public void run() {
                System.out.println("Run Method --> "+Thread.currentThread().getName());
            }
        }
        Worker worker=new Worker();
//        worker.start()  CTE<-- Because Runnable contains only one method run

        Thread thread=new Thread(worker);
        thread.setName("Worker");
        thread.start();
        System.out.println("Main Method -->"+Thread.currentThread().getName());
    }
}
