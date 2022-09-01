package Arrays;

public class SwapAlterantive {
    public static int[] swapAlternativeEle(int N, int[] arr) {
        for (int i = 0; i < N; i+=2) {
            int temp;
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        swapAlternativeEle(6, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
