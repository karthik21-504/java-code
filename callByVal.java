class Account{
    String Name;
    String Website;
}
public class callByVal
{
    public static void main(String[] args) {
        Account a = new Account();
        a.Name="MyWebsite";
        a.Website="www.mywebsite.com";
        a = changeMe(a);
        System.out.println("Website --"+a.Website);
    }
    public static Account changeMe(Account b){
        b=new Account();
        b.Website="www.salesforce.com";
        return b;
    }
}
