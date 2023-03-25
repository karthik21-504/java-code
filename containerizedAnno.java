import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import mypackage.Annotations.Anno;
import mypackage.Annotations.containerAnno;

public class containerizedAnno {
    @Anno(str="First Main Annotation",val=100)
    @Anno(str="Second Main Annotation",val=56)
    public static void exam(String s,int v)
    {
        containerizedAnno c = new containerizedAnno();
        try {
            Method g = c.getClass().getMethod("exam", String.class , int.class);


            Annotation x=g.getAnnotation(containerAnno.class);
            System.out.println(x);
        }
        catch(NoSuchMethodException r)
        {
            System.out.println(""+r);
        }

    }
    public static void main(String[] args) {
            exam("hi",10);
    }
}
