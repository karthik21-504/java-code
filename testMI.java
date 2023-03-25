import java.lang.*;

interface A{
    void callMeA();
    default int callStr(int u)
    {
        int x=calSqr(u);
        return x/2;
    }
    private int calSqr(int y)
    {
        return y*y;
    }
    static int val()
    {
        return 0;
    }
}
interface B{
    void callMeB();
    default String callStr()
    {
        return "HELLo";
    }
}
class C implements A,B
{
    public void callMeA()
    {
        System.out.println("interface of A");
    }
    public String callStr() {
        return "Hey There!!";
    }

    public void callMeB() {
        System.out.println("interface of B");
    }
}
class D extends C implements A,B
{
    public void callMeA()
    {
        System.out.println("Different msg of A in D");
    }

    public String callStr()
    {
        return "This will be called";
    }
    public void callMeB()
    {
        System.out.println("Different msg of B in D");
    }
}
public class testMI
{
    public static void main(String[] args)
    {
        A a=new C();
        a.callMeA();
        B b=new C();
        b.callMeB();
        A x=new D();
        x.callMeA();
        B y=new D();
        int l=A.val();
        System.out.println(y.callStr());
        System.out.println(l);
        y.callMeB();
    }
}
