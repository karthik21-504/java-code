enum Apple{
    GoldenReg(10),RedWine(5),GreenDelight(4),OrangeBlast(6),SweetRej(20),RottenPlu;
    private final int price;
    Apple(int p){
        price=p;
    }
    Apple() {price = -1;}
    int getPrice()
    {
        return price;
    }
}

public class enumImp{
    public static void main(String[] args) {
        Apple[] a =Apple.values();
        for(Apple p: a)
        {
            System.out.print(p+" ");
            System.out.println(p.getPrice()+" cents");
        }
        Apple i= Apple.valueOf("GoldenReg");
        Apple j= Apple.valueOf("GoldenReg");
        if(i.compareTo(j) == 0 )// if i.compareTo(j)<0 i comes before j   if i.compareTo(j)>0 j comes before i
        {
            System.out.println("equals");
        }
        System.out.println(i);
    }
}
