package multithreading;

public class M12_JoinMethod {
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

        thread1.join(1000);// it will be waited for another thread *only for Specified time
        thread2.join(1000);// it will be waited for another thread *only for Specified time
        System.out.println("Rest of the main");
    }
}
