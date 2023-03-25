class Q {
    int n;
    boolean val=false;
    synchronized int get(){
        while(!val) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(" " + e);
            }
        }
        System.out.println("Got: "+n);
        val=false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while(val)
        {
            try{
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(" " + e);
            }
        }
        this.n=n;
        val = true;
        System.out.println("Put: "+n);
        notify();
    }
}

class Producer implements Runnable
{
    Q q;
    Thread t;
    Producer(Q q)
    {
        this.q=q;
        t=new Thread(this,"Producer");
    }

    public void run() {
        int i=0;
        int h=10;
        while(h>0) {
            h--;
            q.put(i++);
        }
    }
}
class Consumer implements Runnable
{
    Q q;
    Thread t;
    Consumer(Q q)
    {
        this.q=q;
        t=new Thread(this,"Consumer");
    }
    public void run() {
        int i=0;
        int k=10;
        while(k>0){
            q.get();
            k--;
        }
    }
}
public class PCThread
{
    public static void main(String[] args)
    {
        Q a=new Q();
        Producer x=new Producer(a);
        Consumer y=new Consumer(a);

        x.t.start();
        y.t.start();

        System.out.println("Press Control+C to escape");
    }
}
