public class exceptionTest
{
    public static void test() throws IllegalAccessException
    {
        throw new IllegalAccessException();
    }
    public static void main(String[] args) {
        try {
            test();
        }
        catch (IllegalAccessException e){
            System.out.println(""+e);
        }
    }
}
