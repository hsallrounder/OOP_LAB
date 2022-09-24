package practice;

class T1 extends Thread {
    public void run(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread1 Completed.");
    }
}

class T2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread2 Completed.");
    }
}
public class MyMain {
    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new Thread(new T2());
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
