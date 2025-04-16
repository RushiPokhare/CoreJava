package multithreading;

public class M9_Sum_WithoutThreading {
    public static void main(String[] args) {
        long start=1L;
        long end=10000000000L;
        long sum=0;

        long startTime=System.currentTimeMillis();
        for (long i = start; i <=end; i++) {
            sum=sum+i;
        }
        System.out.println("Sum is -->"+sum);
        long endTime=System.currentTimeMillis();

        System.out.println("Required time for code Execution is : "+(endTime-startTime)+"ms");
    }
}
// it takes more time we take same example using multithreading