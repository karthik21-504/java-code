class S{
    static synchronized void call(T b){
        String name=Thread.currentThread().getName();
        System.out.println(name+"\n Inside A's call"+'\n');
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println("Thread Interrupted"+e);
        }
        b.last();
    }
    static synchronized void last(){
        System.out.println("Inside A's"+'\n');
    }
}
class T{
    static synchronized void call(S a) {
        String name=Thread.currentThread().getName();
        System.out.println(name+"\n Inside A's call"+'\n');
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println("Thread Interrupted"+e);
        }
        a.last();
    }
    static synchronized void last(){
        System.out.println("Inside B's"+'\n');
    }
}

class DeadLock implements Runnable{
    S a;
    T b;
    Thread t;
    DeadLock(){
        t= new Thread(this,"Racing Thread");
    }
    void DeadLockStart() {
        t.start();
        a.call(b);
        System.out.println("Back in Main Thread");
    }
    public void run()
    {
        b.call(a);
        System.out.println("Back in other hand");
    }
}
public class testDL {
    public static void main(String[] args) {
        DeadLock dl=new DeadLock();
        dl.DeadLockStart();
    }
}
