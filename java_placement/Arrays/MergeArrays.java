package Arrays;

public class MergeArrays {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        //int n = arr1.length + arr2.length;
        int arr[] = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                k++;
                i++;
            } else {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i<arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while (j<arr2.length) {
            arr[k] = arr2[j];
            k++;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 6, 9, 15 };
        int arr2[] = { 1, 4, 6, 7 };
        int arr[] = mergeSortedArrays(arr1, arr2);
        for (int i = 0; i < (arr1.length + arr2.length); i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
