package mypackage;

class GenClass3<T>{
    T obj;
    GenClass3(T obj){
        this.obj=obj;
    }
    T getObj(){
        return obj;
    }
}
class GenClass4<T> extends GenClass3<T>{
    GenClass4(T o){
        super(o);
    }
}
public class WildcardGeneric {
    public static void main(String[] args) {
        GenClass3<Integer> i=new GenClass3<>(0);
        GenClass4<Integer> s=new GenClass4<>(99);
        GenClass3<String> ki=new GenClass3<>("Boom");
        if(s instanceof GenClass3<?>){
            System.out.println("i is instance of GenClass3");
        }
        if(s instanceof GenClass4<?>)
        {
            System.out.println("i is instance of GenClass4");
        }
        System.out.println();
        if(ki instanceof GenClass3<?>){
            System.out.println("ki is instance of GenClass3");
        }
        if(ki instanceof GenClass4<?>)
        {
            System.out.println("ki is instance of GenClass4");
        }
    }
}
