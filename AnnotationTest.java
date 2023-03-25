import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;

@Retention(RetentionPolicy.RUNTIME)
@interface newAno {
     String str();
     int val();
}

public class AnnotationTest {
    @newAno(str= "myAnnotation",val = 100)
    public static void meth(String k,int y){
        AnnotationTest ob= new AnnotationTest();
        try{
            Class<?> c=ob.getClass();
            Method m= c.getMethod("meth", String.class, int.class);
            newAno b=m.getAnnotation(newAno.class);

            System.out.println(b.str()+" "+b.val());
        }
        catch (Exception e)
        {
            System.out.println("<====>"+e);
        }
    }
    public static void main(String[] args) {
        meth("Hello",10);
        Array[] arr=new Array[5];
    }
}
