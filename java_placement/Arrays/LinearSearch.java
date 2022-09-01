package Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static void inputSearch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number that you want to search in an array");
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (x == numbers[i]) {
                System.out.println("x found at index: " + i);
            }
            else{
                System.out.println("-1");
            }
        }
        sc.close();

    }
    public static void main(String[] args) {
        inputSearch();
    }
}
