interface fact{
    boolean check(int n,int d);
}
public class isFactor {
    public static void main(String[] args)
    {
        fact f;
        f =(n,d) ->(n%d)==0;
        int a=100,b=5;
        if(f.check(a,b)) System.out.println(b +" is factor of "+ a);
        else System.out.println("not a factor");
    }
}
