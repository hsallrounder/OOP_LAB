package Sync_23_11_21;

import java.util.Scanner;

class Account {
    public int balance;

    public Account() {
        Scanner sc = new Scanner(System.in);
        this.balance = sc.nextInt();
    }

    public void withdraw(int val) throws InterruptedException {
        Thread.sleep(1000);
        balance-=val;
        System.out.println("without synchronized: "+balance);
    }

    public synchronized void withdraw_sync(int val) throws InterruptedException {
        Thread.sleep(1000);
        balance-=val;
        System.out.println("with synchronized: "+balance);
    }
}
class Mythread extends Thread{
    Account obj = null;
    public Mythread(Account tobj){
        obj=tobj;
    }
    public void run() {
        try {
            obj.withdraw(500);
            obj.withdraw_sync(500);
        } catch (InterruptedException e) {
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Account obj = new Account();
        Mythread t1 = new Mythread(obj);
        Mythread t2 = new Mythread(obj);
        t1.start();
        t2.start();
    }
}
