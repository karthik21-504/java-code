interface myNum<T>{
    T getValue(T s);
}
interface isTrue{
    boolean isEqual(int v);
}
public class LambdaExp {
    public static void main(String[] args) {
        String s = "Hello";
        myNum<String> m = (n)->{
            StringBuilder k = new StringBuilder();
            for(int i=n.length()-1;i>=0;i--)
            {
                k.append(s.charAt(i));
            }
            return k.toString();
        };
        System.out.println(m.getValue(s));
    }
}