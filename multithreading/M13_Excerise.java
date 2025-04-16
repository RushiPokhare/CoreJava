package multithreading;

public class M13_Excerise {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()->{
            for (int i = 0; i <=10 ; i++) {
                if(i%2==0){
                    System.out.println("Even -> "+i);
                }
            }
        },"Thread1");
        Thread thread2=new Thread(()->{
            for (int i = 0; i <=10 ; i++) {
                if(i%2==0){
                    System.out.println("odd -> "+i);
                }
            }
        },"Thread2");
        thread1.start();
        thread2.start();

        thread1.join(2000);
        thread2.join(4000);
        System.out.println("Rest of the main");
    }
}
