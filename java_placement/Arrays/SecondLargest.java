package Arrays;

public class SecondLargest {
    public static int secondLargetEle(int arr[]) {
        // Time Complexity is o(nlogn)
        /* for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }       
        return arr[arr.length-2]; */

        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            }
            else if(arr[i]>secmax && arr[i]!=max){
                secmax = arr[i];
            }
        }
        return secmax;
    }
    public static void main(String[] args) {
        int arr[] = {9,3,6,2,9};
        System.out.println(secondLargetEle(arr));
    }
}
