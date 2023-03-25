package mypackage;

public class NewThread implements Runnable
{
    callBy v;
    String name;
    public Thread t;
    public NewThread(callBy v, String name)
    {
        this.v=v;
        this.name=name;
        t=new Thread(this,name);
    }
    public void run(){
        v.newCall(name);
    }
}
