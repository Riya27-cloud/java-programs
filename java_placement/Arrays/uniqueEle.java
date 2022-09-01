//Time complexity of this code is O(n2)
package Arrays;

public class uniqueEle {
    public static int uniqueNumber(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (i!=j) {
                    if (arr[i]==arr[j]) {
                        break;
                    }
                }
                
            }
            if (j==arr.length) {
                return arr[i]; 
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,6,3,6,2};
        System.out.println(uniqueNumber(arr));
        System.out.println(arr.length);
    }
}
