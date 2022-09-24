package Multithreading_17_11_2021;
/*
class Mythread implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("my thread "+i);
        }
    }
}
 */
public class MyExp {
    public static void main(String[] args) {
        Thread obj1 = new Thread(() -> {
            for(int i=0;i<10;i++){
                System.out.println("Main thread"+i);
            }
        });
        obj1.start();
        for(int i=0;i<10;i++){
            System.out.println("Main thread"+i);
        }
    }
}
