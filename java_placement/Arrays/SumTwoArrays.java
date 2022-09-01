package Arrays;

public class SumTwoArrays {
    public static int[] sumTwoArrays(int arr1[], int arr2[], int oupt[]) {
        int i = arr1.length-1;
        int j = arr2.length-1;;
        int k = Math.max(arr1.length, arr2.length);
        int carry =0;
        while (i>=0 && j>=0) {
            int num = arr1[i] + arr2[j] + carry;
            oupt[k] = num%10;
            carry = num/10;
            k--;
            j--;
            i--;
        }
        while (i>=0) {
            int num = arr1[i] + carry;
            carry = num/ 10;
            oupt[k] = num%10;
            i--;
            k--;
        }

        while (j>=0) {
            int num = arr2[j] + carry;
            carry = num/10;
            oupt[k] = num%10;
            j--;
            k--;
        }
        oupt[0]= carry;
        return oupt;
    }
    public static void main(String[] args) {
        int arr1[] = {2,4,5,3};
        int arr2[]= {2,8,7};
        int oupt[] = new int[5];
        int out1[] = sumTwoArrays(arr1, arr2, oupt);
        for ( int i = 0; i < out1.length; i++) {
            System.out.print(out1[i] + " ");
        }
    }
}
