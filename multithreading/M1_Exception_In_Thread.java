package multithreading;

public class M1_Exception_In_Thread {
    public static void main(String[] args) {
        class Worker extends Thread {
            @Override
            public void run() {
                System.out.println(10/0);
                System.out.println("run Method --> "+Thread.currentThread().getName());
//                Here is an Exception the worker thread.
//                Exception in one thread can't terminate other thread
            }
        }
            Worker worker=new Worker();
            worker.setName("Worker"); // Setting the name to the current Thread
            worker.start();
        System.out.println("Main Method --> "+Thread.currentThread().getName());
        }
    }

