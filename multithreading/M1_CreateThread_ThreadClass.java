package multithreading;

//Creating Thread Using Thread Class

public class M1_CreateThread_ThreadClass{
    public static void main(String[] args) {
        class Worker extends Thread {
            @Override
            public void run() {
                System.out.println("Worker Job");
            }
        }
            Worker worker=new Worker();
            worker.start();
        }
    }

//    ***    OR    ****

//public class M1_CreateThread_ThreadClass extends Thread{
//    @Override
//    public void run(){
//        System.out.println("");
//    }
//
//    public static void main(String[] args) {
//        M1_CreateThread_ThreadClass m1CreateThreadThreadClass=new M1_CreateThread_ThreadClass();
//        m1CreateThreadThreadClass.start();
//    }
//}

