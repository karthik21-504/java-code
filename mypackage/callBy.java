package mypackage;

public class callBy
{
    public void newCall(String name)
    {
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(400);
            }
        }
        catch(Exception e)
        {
            System.out.println("Interrupted" +e);
        }
        System.out.println(name + " Exited......");
    }
}
