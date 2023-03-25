import java.io.*;
class X
{
    X()
    {
        System.out.println("Inside X");
    }
}
class Y extends X
{
    Y()
    {
        System.out.println("Inside Y");
    }
}
class Z extends Y
{
    Z()
    {
        System.out.println("Inside Z");
    }
}
class A2{
    int i,j;
    A2(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    void cal()
    {
        System.out.println("val is:"+ i*j);
    }
}
class B2 extends A2
{
    int k;
    B2(int a,int b,int k)
    {
        super(a,b);
        this.k=k;
    }
    void cal()
    {
        System.out.println("val is:"+ i*j*k);
    }
}
public class inheritance
{
    public static int[] Map1(String[] str)
    {
        int[] a=new int[str.length];
        for(int i=0;i< str.length;i++)
        {
            a[i]=Integer.parseInt(str[i]);
        }
        return a;
    }
    public static void calTwo(int x,int y)
    {
        A2 a=new A2(x,y);
        a.cal();
    }
    public static void calCub(int x,int y,int h)
    {
        B2 b;
        b=new B2(x,y,h);
        b.cal();
    }
    public static void main(String[] args)throws IOException {
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        int[] val= Map1(br.readLine().split(" "));
        if(t==2) {
            calTwo(val[0],val[1]);
        }
        else {
            calCub(val[0],val[1],val[2]);
        }*/
        Z p=new Z();
    }
}
