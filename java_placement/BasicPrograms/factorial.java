package BasicPrograms;

import java.util.Scanner;

public class factorial {
    public static void calculateFactorial(int n) {
        if (n<0) {
            System.out.println("Invalid Input");
            return;
        }

        int fact =1;
        for(int i = 1; i <= 5; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt(); 
            calculateFactorial(n);
        }
    }
}
