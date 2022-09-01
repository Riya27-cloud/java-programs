package Arrays;

public class ZeroesEnd {
    public static int[] sortZeroesEnd(int[] arr) {
        int zeroEnd = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] != 0) {
            int temp = arr[zeroEnd];
            arr[zeroEnd] = arr[i];
            arr[i] = temp;
            zeroEnd++;
           }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {2,0,0,1,3,0,0};
        int arr1[] = sortZeroesEnd(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
