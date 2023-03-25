
public class AssertionClass {
    private static int num=4;
    public static int getNum(){
        return num--;
    }
    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n=getNum();
            assert n>0;
            System.out.println(n+" ");
        }
    }
}