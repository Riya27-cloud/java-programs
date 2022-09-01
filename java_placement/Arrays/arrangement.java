package Arrays;

import java.util.Scanner;

public class arrangement {
    public static void arrayPopulate() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i =0, j = n-1;
        int number = 1;
        while(i < j){
            arr[i] = number;
            number++;
            i++;
            arr[j] = number;
            number++;
            j--;
        }
        if(i==j){
            arr[i] = number;
        }
        System.out.println(arr);
        sc.close();
    }
    public static void main(String[] args) {
        //System.out.println(arrayPopulate());
        arrayPopulate();
    }
}
