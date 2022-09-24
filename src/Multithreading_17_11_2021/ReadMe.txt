Multitasking:
Execute multiple tasks simultaneously
    1) Process Based
    2) Thread Based

two ways:
    1) Thread Class
    2) Runnable Interface

Q. How to create multithreaded application?
Ans.
1 Step:
class Mythread extends Thread{
}

2 Step:
class Mythread extends Thread{
    @Override
    public void run(){
    //logic of this thread
    }
}

3 Step:
Mythread obj=new Mythread();
or
Thread obj1 =new Mythread();

4 Step:
obj1.start();



  functional interface
Runnable (run method is declared in Runnable interface)
    Thread
        mythread

States in Multithreading:

new born state

start

dead / terminate