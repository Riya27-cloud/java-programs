package Arrays;

public class Sort012 {
    public static int[] sort012(int arr[]) {
        int i = 0;
        int nz = 0;
        int nt = arr.length-1;
        while (i <= nt) {
            if (arr[i] == 0) {
                int temp = arr[nz];
                arr[nz] = arr[i];
                arr[i] = temp;
                nz++;
                i++;
            }else if(arr[i]==1){
                i++;
            }else{
                int temp1 = arr[nt];
                arr[nt] = arr[i];
                arr[i] = temp1;
                nt--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,2,0,1};
        int arr1[] = sort012(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
