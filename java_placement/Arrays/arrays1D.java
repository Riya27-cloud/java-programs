package Arrays;

import java.util.Scanner;

public class arrays1D {

    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }

    public static void output(int input[]) {
        int size = input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static int largest(int array[]) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        return max;
    }

    public static int smallest(int array[]) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > min) {
                min = array[j];
            }
        }
        return min;
    }

    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = input();
        output(arr);
        System.out.println(largest(arr));
        System.out.println(smallest(arr));
        System.out.println(sum(arr));
    }
}
