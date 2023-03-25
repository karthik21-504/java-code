interface ear
{
    int value(int k);
}
interface nose
{
    int valuen(int n);
}
interface mouth
{
    int valuem(int x);
}
interface eyes
{
    int valuee(int y);
}

class face implements ear,nose,mouth,eyes{
    public int value(int x)
    {
        return x;
    }
    public int valuen(int y)
    {
        return y;
    }
    public int valuem(int z)
    {
        return z;
    }
    public int valuee(int l) {
        return l;
    }
    public void canYouAccess()
    {
        System.out.println("You accessed me!!");
    }
}
public class testPkg
{
    public static void main(String[] args)
    {
        int x,y,z,a;
        ear e=new face();
        x=e.value(2);
        nose n=new face();
        y=n.valuen(1);
        mouth m=new face();
        z=m.valuem(1);
        eyes b=new face();
        a=b.valuee(2);
        System.out.println(x+" \t"+y+" \t"+z+" \t"+a);
    }
}
