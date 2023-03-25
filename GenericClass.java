class Gen<T>{
    private T obj;
    Gen(T obj)
    {
        this.obj=obj;
    }
    T getOb(){
        return obj;
    }
    void showVal(){
        System.out.println("Type of T is "+ obj.getClass().getName());
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Gen<Integer> iObj=new Gen<>(88);
        Gen<String> sObj=new Gen<>("Hello");
        iObj.showVal();
        int g= iObj.getOb();
        System.out.println(g);
        sObj.showVal();
        String h= sObj.getOb();
        System.out.println(h);
    }
}