class test{
    synchronized void call(String name){
        System.out.print("["+name);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println(" "+e);
        }
        System.out.print("]");
    }
}
class calling implements Runnable{
    test h;
    Thread t;
    String name;
    calling(test h,String name)
    {
        this.h=h;
        this.name=name;
        t=new Thread(this);
    }
    public void run(){
        h.call(name);
    }
}
public class threadBracket {
    public static void main(String[] args) {
        test g=new test();
        calling f=new calling(g,"one");
        calling j=new calling(g,"two");
        calling r=new calling(g,"three");

        f.t.start();
        j.t.start();
        r.t.start();
    }
}
