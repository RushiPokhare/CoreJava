package multithreading;

public class M11_SleepMethod {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <=10; i++) {
            System.out.println(i);
            Thread.sleep(2000); // In Java, the sleep() method belongs to the Thread class, but it's a static method. That means you don't need to create an object of Thread, or extend the Thread class, to use it.
        }
    }
}
