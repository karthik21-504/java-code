import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.Scanner;

public class exceptionHandling
{
    public static void main(String[] args) {
        try {
            int d = 1;
            int x = 43 / d;
            int[] f={8};
            //f[42]=0;
        }
        catch(ArithmeticException e){
            System.out.println(""+e);
        }
        catch(ArrayIndexOutOfBoundsException f){
            System.out.println(" "+f);
        }
        try{
            int c=9;
        }

        /*catch(Exception e){
            System.out.println(""+e);
        }*///cannot use Exception since Exception is superclass of all exception, once exception caught will not be caught below(Throwable => EXCEPTION ERROR
        catch(ArithmeticException e){
            System.out.println(" "+e);
        }
        catch(Exception e){
            System.out.println(""+e);
        }
        try {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            if(a==0)
            {
                int x=a/0;
            }
            try{
                if(a==1)
                {
                    a=a/(a-a);
                }
                else if(a==2)
                {
                    int[] p={8};
                    p[23]=0;
                }
            }
            catch(ArrayIndexOutOfBoundsException u)
            {
                System.out.println(""+u);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(""+e);
        }
    }
}
