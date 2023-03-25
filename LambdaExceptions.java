interface LambdaExec{
    double mok(double[] arr) throws EmptyArrayException;
}
class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Array is Empty");
    }
}
public class LambdaExceptions {
    public static void main(String[] args) throws EmptyArrayException{//this is important
        double[] ar={1.0,2.0,3.0,4.0};
        LambdaExec e=(n)->{
            double sum = 0.0;
            if(n.length == 0)
                throw new EmptyArrayException();
            for(int i=0;i<n.length;i++)
            {
                sum += n[i];
            }
            return sum/n.length;
        };
        System.out.println(e.mok(ar));
        System.out.println(e.mok(new double[0]));
    }
}
