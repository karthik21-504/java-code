interface inface{
    String mod(String h);
}
class StrModify{
    public static String passAsPar(inface g,String k){
        return g.mod(k);
    }
    public static void main(String[] args){
        String inStr="This is the Power of Lambda Expressions";
        String s;
        s = passAsPar((n)-> n.toUpperCase(),inStr);
        System.out.println(s);
        s = passAsPar((n)-> {
            StringBuilder f=new StringBuilder();
            for(int i=0;i<n.length();i++)
            {
                if(n.charAt(i)!=' ')
                {
                    f.append(n.charAt(i));
                }
            }
            return f.toString();
        },inStr);
        System.out.println(s);
        s = passAsPar((n)->{
            StringBuilder b=new StringBuilder();
            for(int i=n.length()-1;i>=0;i--)
            {
                b.append(n.charAt(i));
            }
            return b.toString();
        },inStr);
        System.out.println(s);
    }
}
