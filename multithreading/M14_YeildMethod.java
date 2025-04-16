package multithreading;

public class M14_YeildMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Someone disturbed while sleeping");
            }
            System.out.println("thread1 run method --> "+Thread.currentThread().getName());
        },"Thread 1");


        Thread thread2=new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Someone disturbed while sleeping");
            }
            System.out.println("thread2 run method --> "+Thread.currentThread().getName());
        },"Thread 2");

        thread1.start();
        thread2.start();

        thread1.join(1000);
        thread2.join(1000);

        Thread.yield();//it's just a Suggestion for thread scheduler.
        System.out.println("Rest of the main");
    }
}
