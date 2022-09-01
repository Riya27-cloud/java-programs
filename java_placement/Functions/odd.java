package Functions;

import java.util.Scanner;

public class odd {
    public static int sumOfOdd(int n) {
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                temp = temp + i;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Please Enter the number");
            int n = scn.nextInt();
            int sum = sumOfOdd(n);
            System.out.println(sum);
        } 
    }
}
