package multithreading;

public class M5_M4ExampleAnonymous_Class {
    public static void main(String[] args) {
//Anonymous class
        Runnable runnable=new Runnable(){
            @Override
            public void run() {
                System.out.println("Run Method --> "+Thread.currentThread().getName());
            }
        };

        Thread thread=new Thread(runnable);
        thread.setName("Worker");
        thread.start();
        System.out.println("Main Method -->"+Thread.currentThread().getName());
    }
}
