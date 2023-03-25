package mypackage;

class NonGenSuper{
    int obj;
    NonGenSuper(int obj){
        this.obj=obj;
    }
    int getObj3(){
        return obj;
    }
}
class GenClass<T>{
    private T obj;
    GenClass(T obj)
    {
        this.obj=obj;
    }
    T getObj(){
        return obj;
    }
}
class GenClazz<T,V> extends GenClass<T>{
    V obj;
    GenClazz(T o,V obj){
        super(o);
        this.obj=obj;
    }
    V getObj2() {
        return obj;
    }
}
class GenericSub<T> extends NonGenSuper{
    T ob;
    GenericSub(int k,T ob){
        super(k);
        this.ob=ob;
    }
    T getObj(){
        return ob;
    }
}
public class GenInheritance {
    public static void main(String[] args) {
        GenClazz<Integer,String> k=new GenClazz<>(50,"Hey");
        System.out.println(k.getObj());
        System.out.println(k.getObj2());

        GenericSub<String> n=new GenericSub<>(88,"Hello");
        System.out.println(n.getObj3()+" "+n.getObj());
    }
}
