package BasicPrograms;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                } 
                System.out.println();           
            }
        }
    }
}
