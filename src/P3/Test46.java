package P3;

class Parent{
    int num1=90_000;
}
class Child extends Parent{
    int num1 = 80_000;
    public void m1(){ // instance method
        System.out.println(num1);
        System.out.println(super.num1);
    }
}
public class Test46 {
    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.m1();
    }
}
