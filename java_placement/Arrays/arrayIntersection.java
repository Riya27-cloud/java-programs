package Arrays;

public class arrayIntersection {
    public static int commonElement2(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    return arr1[i];
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int arr1[] = {6, 1, 2};
        int arr2[] = {1, 2, 3, 6, 2};
        System.out.println(commonElement2(arr1, arr2));
    }
}
