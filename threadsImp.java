class NewThread implements Runnable{
    Thread t;
    NewThread() {
        t=new Thread(this,"MyDemo"); // super ("MyDemo") for extends Thread
        System.out.println("Child Thread :" + t);
    }
    public void run()
    {
        try{
            for(int i=5;i>0;i--)
            {
                System.out.println("Inside Child Thread: "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child Thread Interrupted"+ e);
        }
        System.out.println("Exiting the Child Thread....");
    }
}

public class threadsImp
{
    public static void main(String[] args)
    {
//        Thread t=Thread.currentThread();
//        System.out.println("cT:"+ t);//cT-currentThread
//        t.setName("myThread");
//        System.out.println("cT after changing name:" +t);
//        try{
//            for(int i=0;i<10;i++) {
//                System.out.println(""+i);
//                Thread.sleep(2000);
//            }
//        }
//        catch (InterruptedException e)
//        {
//            System.out.println("Main Thread Interrupted:"+ e);
//        }
        NewThread x=new NewThread();
        x.t.start();// Implements Runnable x.t.start()  extends Thread x.start();
        try{
            for(int i=5;i>0;i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Main Thread Interrupted: " + e);
        }
        Integer k=5;
        System.out.println("Exiting the Main Thread....");
    }
}
