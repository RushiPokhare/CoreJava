package multithreading;

public class M8_EvenOdd {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            for (int i = 0; i <= 10; i++) {
                if(i%2==0){
                    System.out.println(i+""+Thread.currentThread().getName());
                }
            }
        },"Even");

        Thread thread2 =new Thread(()->{
            for (int i = 0; i < 10; i++) {
                if(i%2!=0){
                    System.out.println(i+""+Thread.currentThread().getName());
                }
            }
        },"odd");

        thread1.start();
        thread2.start();
    }
}
