class TwoGen<T,V>{
    T obj1;
    V obj2;
    TwoGen(T obj1,V obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    T getObj1(){
        return obj1;
    }
    V getObj2(){
        return obj2;
    }
    void showObj1(){
        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());
    }
}
public class DualGeneric{
    public static void main(String[] args) {
        TwoGen<Integer,String> g=new TwoGen<>(88,"Hello");
        TwoGen<String,String> h=new TwoGen<>("Hi","Hello2");

        int b = g.getObj1();
        String d = g.getObj2();
        g.showObj1();
        System.out.println("object1 is "+b);
        System.out.println("object2 is "+d);
        System.out.println();
        String b1 = h.getObj1();
        String d1 = h.getObj2();
        h.showObj1();
        System.out.println("object1 is "+b1);
        System.out.println("object2 is "+d1);
    }
}
