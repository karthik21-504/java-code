import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.LinkedList;

class Stack1 {
    int i = 0;
    int size;
    int[] arr;

    // This is the constructor for Stack.
    Stack1(int size) {
        this.size = size;
        arr = new int[this.size];
    }

    void push(int val) {
        if (i < size) {
            arr[i] = val;
            i++;
        } else {
            arr = Arrays.copyOf(arr, size + 1);
            size = size + 1;
            arr[i] = val;
            i++;
        }
    }

    int pop() {
        if (size == 0) {
            return -1;
        } else {
            int k = size;
            size = size - 1;
            return arr[k - 1];
        }
    }

    int size() {
        return arr.length;
    }
}
public class stack {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            Stack1 s=new Stack1(n);
            String[] inp=br.readLine().split(" ");
            for(int i=0;i<n;i++)
            {
                int k=Integer.parseInt(inp[i]);
                //System.out.println(s.size());
                s.push(k);
            }
            int op=Integer.parseInt(br.readLine());
            String[] st=br.readLine().split(" ");
            for(int i=0;i<op;i++)
            {
                if(st[i].equalsIgnoreCase("push"))
                {
                    s.push(10);
                    System.out.println(s.size());
                }
                else
                {
                    bw.write(s.pop()+"\n");
                }
            }
            LinkedList<Integer> h=new LinkedList<Integer>();
        }
        bw.flush();
    }
}

