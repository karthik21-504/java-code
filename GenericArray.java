class ArrayGen<T extends Number> {
    T[] num;
    ArrayGen(T[] num){
        this.num=num;
    }
    double Average(){
        double sum = 0;
        for (T t : num) {
            sum += t.doubleValue();
        }
        return sum/ num.length;
    }
    boolean isSameAvg(ArrayGen<?> ob){
        return Average() == ob.Average();
    }

}
public class GenericArray {
    public static void main(String[] args) {
        Integer[] iNum={1,2,3,4,5};
        Double[] dNum={1.1,2.2,3.3,4.4,5.5};
        ArrayGen<Integer> iOb=new ArrayGen<>(iNum);
        ArrayGen<Double> dOb=new ArrayGen<>(dNum);

        System.out.println(iOb.Average());
        System.out.println(dOb.Average());
        System.out.println(iOb.isSameAvg(dOb));
    }
}
