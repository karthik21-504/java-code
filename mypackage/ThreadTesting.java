package mypackage;

public class ThreadTesting
{
    public static void main(String[] args) {
        callBy b=new callBy();
        NewThread n1=new NewThread(b,"Neon1");
        NewThread n2=new NewThread(b,"Neon2");
        NewThread n3=new NewThread(b,"Neon3");

        n1.t.start();
        n2.t.start();
        n3.t.start();
    }
}
