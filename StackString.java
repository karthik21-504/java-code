import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class StackString {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.nextLine();
            System.out.println(s);
            String tar="meow";
            Stack<Character> stk=new Stack<>();
            for(int i=0;i<tar.length()-1;i++)
            {
                stk.push(tar.charAt(i));
            }
            s=s.toLowerCase();
            for(int i=n-1;i>=0;i--)
            {
                if(stk.isEmpty())
                {
                    System.out.println("YES"+"\n");
                    return;
                }
                if(s.charAt(i)==stk.peek()) {
                    stk.pop();
                }
            }
            if(stk.isEmpty()) {
                System.out.println("YES"+"\n");
            }
            else {
                System.out.println("NO"+"\n");
            }
        }
    }
}
