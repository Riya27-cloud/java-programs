package Functions;

import java.util.Scanner;

public class GCD {
    public static void calculateGCD(int n1, int n2) {
        if(n1 == 0){
            System.out.println(n2);
        } else if(n2 == 0){
        System.out.println(n1);
        return;
        }else{
        while (n1 != n2) {
            if (n1>n2) {
                n1 = n1-n2;
            } else {
                n2 = n2-n1;
            }
        }
    }
        System.out.println(n2);
        return;
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            calculateGCD(n1, n2);
        }
    }
}
