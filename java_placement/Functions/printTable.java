package Functions;

import java.util.Scanner;

public class printTable {
    public static void table(int n) {
        int mul = 1;
        for (int i = 1; i <= 10; i++) {
            mul = n * i;
            System.out.println( n +" * " + i + " = " + mul);   
        }
        return;
    }
    public static void main(String[] args) {
        try (Scanner scm = new Scanner(System.in)) {
            System.out.println("Please Enter the Number: ");
            int n = scm.nextInt();
            table(n);
        }
    }
}
