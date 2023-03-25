package mypackage;

class Test{
    private double val;
    <T extends Number> Test(T arg)
    {
        val = arg.doubleValue();
    }
    public double getVal()
    {
        return val;
    }
}
public class GenConst {
    public static void main(String[] args) {
        Test t=new Test(100);
        Test g=new Test(125.9F);
        System.out.println(t.getVal());
        System.out.println(g.getVal());
    }
}
