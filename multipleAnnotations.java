import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)//without these output is empty
@interface myAno{
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface why{
    String str();
}
@Retention(RetentionPolicy.RUNTIME)
@interface Default{//default value Annotations
    String str() default "Default value in str";
}
@Retention(RetentionPolicy.RUNTIME)
@interface marker{}

@myAno(str="myAnnotationClass",val=100)
@why(str="String Description Class")
public class multipleAnnotations {
    @myAno(str="myAnnotationMethod",val=190)
    @why(str="String Description Method")
    public static void exec() {
        try{
            multipleAnnotations n=new multipleAnnotations();
            Annotation[] anc=n.getClass().getAnnotations();
            System.out.println("Class Annotations");
            for(Annotation a:anc)//class Annotations
            {
                System.out.println(a+"\t");
            }
            Method v=n.getClass().getMethod("exec");
            Annotation[] anm= v.getAnnotations();
            System.out.println("Method Annotations");
            for(Annotation a:anm)//method Annotations
            {
                System.out.println(a+"\t");
            }
        }
        catch (NoSuchMethodException e)
        {
            System.out.println(" "+e);
        }
    }
    @Default
    public static void testr(){
        multipleAnnotations o=new multipleAnnotations();
        try{
            Method h=o.getClass().getMethod("testr");
            Default j=h.getAnnotation(Default.class);
            System.out.println(j.str());
       }
       catch (NoSuchMethodException r){
           System.out.println(" "+r);
       }
    }
    @marker
    public static void makerAnno(){//marker Annotations
        multipleAnnotations b=new multipleAnnotations();
        try{
            Class<?> t=b.getClass();
            Method c=t.getMethod("makerAnno");

            boolean v=c.isAnnotationPresent(marker.class);
            System.out.println(v);
        }
        catch(NoSuchMethodException r){
            System.out.println(" "+r);
        }
    }
    public static void main(String[] args) {
        makerAnno();
    }
}
