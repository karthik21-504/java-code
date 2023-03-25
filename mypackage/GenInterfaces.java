package mypackage;

import static java.lang.System.out;

interface myInterface<T extends Comparable<T>>{
    T min();
    T max();
}
class implement<T extends Comparable<T>> implements myInterface<T>{
    T[] obj;
    implement(T[] obj){
        this.obj=obj;
    }
    public T min(){
        T val= obj[0];
        for(int i=1;i< obj.length;i++)
        {
            if(obj[i].compareTo(val) < 0) val=obj[i];
        }
        return val;
    }
    public T max(){
        T val= obj[0];
        for(int i=1;i< obj.length;i++)
        {
            if(obj[i].compareTo(val) > 0) val=obj[i];
        }
        return val;
    }
}
public class GenInterfaces {
    public static void main(String[] args) {
        Integer[] m={1,2,3,4,5};
        Character[] f={'f','d','h','k','o'};
        implement<Integer> mt= new implement<>(m);
        implement<Character> mc=new implement<>(f);
        out.println(mt.min());
        out.println(mt.max());
        out.println(mc.min());
        out.println(mc.max());
    }
}
