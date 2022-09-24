/*
overloading
same name multiple forms
1) by providing different no of arguments
public void m1(int);
public void m1(int, int);
public void m1(int, int, float);
2) by providing different types of arguments
public void m1(int);
public void m1(float);
public void m1(boolean);
3) by interchanging the parameters
public void m1(int, boolean);
public void m1(boolean, int);
 */

package P3;

public class TEST {
    public static void main(String[] args) {
        Exam obj1 = new Exam();
        Exam obj2 = new Exam();
        Exam obj3 = new Exam();
        obj1.setvalue(45,900);
        obj2.setvalue(46,"B.Tech",600);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
