public class chainedExceptions
{
    public static void reqPro()
    {
        NullPointerException e=new NullPointerException("top level");
        e.initCause(new ArrayIndexOutOfBoundsException("base"));
        throw e;
    }
    public static void demoPro()
    {
        NullPointerException e =new NullPointerException("top level");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }
    public static void main(String[] args)
    {
        try {
            demoPro();
            reqPro();
        }
        catch(NullPointerException | ArrayIndexOutOfBoundsException e)// multi catch block
        {
            System.out.println("Caught: "+ e);
            System.out.println("Original Cause: "+ e.getCause());
        }
    }
}
