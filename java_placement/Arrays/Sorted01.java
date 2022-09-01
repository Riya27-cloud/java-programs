package Arrays;

public class Sorted01 {
    public static int[] sortedArray01(int arr[]) {
        int nonZeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                int temp = arr[nonZeroes];
                arr[nonZeroes] = arr[i];
                arr[i] = temp;
                nonZeroes++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0,1};
        int arr1[] = sortedArray01(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
            
        }
        
    }
}
