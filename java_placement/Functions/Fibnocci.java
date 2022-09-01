package Functions;

import java.util.Scanner;

public class Fibnocci {
    public static void fibnocciSeries(int n) {
        int n1 = 0, n2 =1, temp = 0;
        System.out.print(n1 + " " + n2);
        for (int i = 1; i <= n; i++) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            System.out.print(" " + temp);
        }
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            fibnocciSeries(n);
        }
    }
}
