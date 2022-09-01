package Arrays;
public class RotateArray {
    public static int[] rotateArrayByD(int[] arr, int D) {
        /* for (int i = 0; i < D; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;          
        }
        return arr;  */

        
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int D = 2;
        int arr1[] = rotateArrayByD(arr, D);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");            
        }
    }
}
