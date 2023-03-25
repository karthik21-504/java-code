import java.io.*;

public class FileReading {
    public static void main(String[] args){
//        String i;
//        FileInputStream fin=null;
//        try {
//            fin =new FileInputStream(args[0]);
//            i=fin.read("C:\\Users\\MY-PC\\IdeaProjects\\test.txt");
//        }catch(NullPointerException e){
//            System.out.println(" "+e);
//        }catch(IOException e)
//        {
//            System.out.println(""+e);
//        }
        File f=new File("C:\\Users\\MY-PC\\IdeaProjects\\test.txt");
        File g=new File("C:\\Users\\MY-PC\\IdeaProjects\\destination.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            BufferedWriter bw = new BufferedWriter(new FileWriter(g));
            do{
               String s;
               s=br.readLine();
               bw.write(s);
               BufferedReader br1=new BufferedReader(new FileReader(g));
               System.out.println(br1.readLine());
            }while(br.readLine()!=null);
        }
        catch(IOException r) {
            System.out.println(""+ r);
        }
    }
}
