abstract class anyValue
{
    public abstract int intThing(int val);

    public abstract long longThing(long val);

    public abstract double doubleThing(double val);
}
class Man extends anyValue
{
    public int intThing(int val)
    {
        return (int)val;
    }
    public long longThing(long val)
    {
        return (long)val;
    }
    public double doubleThing(double val)
    {
        return (double)val;
    }
}

public class AbstractDemo
{
    public static void printMe(anyValue i) {
        System.out.println(i);
    }
    public static void main(String[] args)
    {
        Object v = 9;
        anyValue obj=new Man();
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
        //anyValue obj=new Man();
        //printMe(9.0f);
    }
}
