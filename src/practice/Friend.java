package practice;

class A{
    int a;

    public A() {
        this.a = 10;
    }
}
class B extends A{

    public B() {
        super();
    }
}
class C extends B{

    public C() {
        super();
    }
}
class chain {
    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj.a);
    }
}
