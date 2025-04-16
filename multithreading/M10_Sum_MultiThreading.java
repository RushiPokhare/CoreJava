package multithreading;

public class M10_Sum_MultiThreading {
    static long sum1;
    static long sum2;
    public static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        Thread fristThread=new Thread(()->{
            for (long i = 1; i <=5000000000L; i++) {
                sum1=sum1+i;
            }
        },"first");
        Thread secondThread=new Thread(()->{
            for (long i = 5000000001L; i <=10000000000L ; i++) {
                sum2=sum2+i;
            }
        },"second");

        long endTime=System.currentTimeMillis();

//        fristThread.start();
//        secondThread.start();
//        System.out.println("sum is -->"+sum); but here is a one issue the output will be 0 because of main thread start first and thread1 and thread2 is start we need to hold on the main thread.

        fristThread.start();
        secondThread.start();

        fristThread.join();//Stop the execution of the main thread
        secondThread.join();// Stop the execution of the main Thread until the first and second thread not be executed

        System.out.println("Sum is --> "+(sum1+sum2));
        System.out.println("Required time is-->"+(endTime-startTime)+"ms");

    }
}
