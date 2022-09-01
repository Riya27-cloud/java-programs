package Arrays;

import java.util.Scanner;

public class duplicateEle {
    public static int findDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    if (arr[i]==arr[j]) {
                        return arr[i];
                    }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(arr));
        sc.close();
    }
}
