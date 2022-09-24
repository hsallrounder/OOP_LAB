/* Anonymous CLass
by using abstract
by using interface
if you don't know the definition then we use abstract modifier
with class
with method

Illegal combination - Private and abstract
final and abstract

Object arr[] = new Object[5];
arr[0] = new Cresult();
arr[1] = new String("GLA")
 */
/*
abstract class Result{
    abstract public void calcResult();
}

class Cresult extends Result{
    @Override
    public void calcResult(){
        System.out.println("Welcome");
    }
}
 */
interface Result1{
    public void calcResult();
    default public void m2()
    {
    }
    public static void m3()
    {
    }
    private void m4()
    {
    }
}
public class test {
    public static void main(String[] args) {
        new Result1(){
            @Override
            public void calcResult(){
                System.out.println("Welcome");
            }
        }.calcResult();
    }
}
