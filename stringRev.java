import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface StrRev{
    String rev(String s);
}
public class stringRev {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String j=br.readLine();
        StrRev k=(s)->{
            String res="";
            for(int i=s.length()-1;i>=0;i--)
            {
              res += s.charAt(i);
            }
            return res;
        };
        System.out.println(k.rev(j));
    }
}
