public class BinarySearch {
    public static int BS(int[] arr,int k){
        int lo=0;
        int hi=arr.length-1;
        int g=0;
        while(lo<=hi) {
            int mid = (lo + hi) / 2;
            if (k < arr[mid]){hi = mid - 1;}
            if (k > arr[mid]){lo = mid + 1;}
            if (k == arr[mid]){g = mid;break;}
        }
        return g;
    }
    public static void main(String[] args) {
        int[] arr={12,13,43,45,67,99};
        int k=67;
        System.out.println(BS(arr,k));
    }
}
