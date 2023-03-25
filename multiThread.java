//class callMe
//{
//    public synchronized void call(String name) {
//        try {
//            for (int i = 5; i > 0; i--) {
//                System.out.println(name + ":" + i);
//                Thread.sleep(200);
//            }
//        } catch (InterruptedException e) {
//            System.out.println(name + "Interrupted...");
//        }
//        System.out.println(name + "Exiting.....");
//    }
//}
import mypackage.NewThread;
import mypackage.callBy;
//class NewThread1 implements Runnable {
//    callBy m;
//    String name;
//    Thread t;
//    NewThread1(String name,callMe m)
//    {
//        this.m=m;
//        this.name=name;
//        t=new Thread(this,name);
//        System.out.println("New Thread: "+t);
//
//    }
//    public void run()
//    {
//        m.call(name);
//    }
//}

public class multiThread
{
    public synchronized static void callNew()
    {
        callBy c=new callBy();
        NewThread x=new NewThread(c,"One");
        NewThread y=new NewThread(c,"Two");
        NewThread z=new NewThread(c,"Three");

        x.t.start();
        y.t.start();
        z.t.start();

        try {
            Thread.sleep(4000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Main Thread Interrupted" + e);
        }
        System.out.println("Main Thread Exited...");
    }
    public static void main(String[] args)
    {
          callNew();
          Integer x = Integer.valueOf("f45");

//        NewThread1 x=new NewThread1("One");
//        NewThread1 y=new NewThread1("Two");
//        NewThread1 z=new NewThread1("Three");
//
//        x.t.start();
//        y.t.start();
//        z.t.start();
//
//        try {
//            Thread.sleep(4000);
//        }
//        catch (InterruptedException e)
//        {
//            System.out.println("Main Thread Interrupted" + e);
//        }
//        System.out.println("Main Thread Exited...");
    }
}
