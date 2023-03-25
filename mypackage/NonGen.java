package mypackage;

public class NonGen {
    static <T extends Comparable<T> , V extends T> boolean genMethod(T obj,V[] arr){
        for(int i=0;i<arr.length;i++)
        {
            if(obj==arr[i]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Integer[] d={1,2,3,4,5};
        Integer k=4;
        if(genMethod(k,d))
        {
            System.out.println("4 is in the array");
        }
        String[] s={"one","two","three","four","five"};
        String h="three";
        if(genMethod(h,s))
        {
            System.out.println("three is in array");
        }
    }
}
