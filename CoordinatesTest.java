class TwoD{
    int a,b;
    TwoD(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class ThreeD extends TwoD{
    int c;
    ThreeD(int a,int b,int c){
        super(a,b);
        this.c=c;
    }
}
class FourD extends ThreeD{
    int d;
    FourD(int a,int b,int c,int d){
       super(a,b,c);
       this.d=d;
    }
}
class GenericArr<T extends TwoD>{
    T[] obj;
    GenericArr(T[] obj){
        this.obj=obj;
    }
}
public class CoordinatesTest {
    static void showXY(GenericArr<?> f){
        for(int i=0;i<f.obj.length;i++) {
            System.out.println(f.obj[i].a+" "+f.obj[i].b);
            System.out.println();
        }
    }
    static void showXYZ(GenericArr<? extends ThreeD> f){
        for(int i=0;i<f.obj.length;i++)
        {
            System.out.println(f.obj[i].a+" "+f.obj[i].b+" "+f.obj[i].c);
            System.out.println();
        }
    }
    static void showAll(GenericArr<? extends FourD> f){
        for(int i=0;i<f.obj.length;i++)
        {
            System.out.println(f.obj[i].a+" "+f.obj[i].b+" "+f.obj[i].c+" "+f.obj[i].d);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        TwoD[] ao = {
                new TwoD(4,5),
                new TwoD(8,9),
                new TwoD(6,7),
                new TwoD(5,0)
        };
        GenericArr<TwoD> x=new GenericArr<>(ao);
        showXY(x);

        FourD[] foa={
                new FourD(98,99,100,101),
                new FourD(5,6,7,8),
                new FourD(12,1,3,134)
        };
        GenericArr<FourD> o=new GenericArr<>(foa);
        showXY(o);
        showXYZ(o);
        showAll(o);
    }
}
