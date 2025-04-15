package multithreading;

//Creating Thread Using Thread Class

public class M1_CreateThread_ThreadClass2 {
    public static void main(String[] args) {
        class Worker extends Thread {
            @Override
            public void run() {
                System.out.println("run Method --> "+Thread.currentThread().getName());

//                Thread.currentThread()<-- its static method and Thread. is a class name
            }
        }
            Worker worker=new Worker();
            worker.setName("Worker"); // Setting the name to the current Thread
            worker.start();
        System.out.println("Main Method --> "+Thread.currentThread().getName());
        }
    }

