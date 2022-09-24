// multilevel inheritance and hierarchical inheritance

package P3;

class A{

}

class B extends A{

}

class C extends A{

}

public class Test23 {
    public static void m1(float f){
        System.out.println("ok");
    }

    public static void m1(double f){
        System.out.println("GLA");
    }


    public static void main(String[] args) {
        m1(45);
    }
}
// Double d = 12.67;
// Boxing
// unboxing
