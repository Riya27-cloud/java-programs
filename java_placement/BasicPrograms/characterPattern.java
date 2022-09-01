package BasicPrograms;

import java.util.Scanner;

public class characterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //   for (int j = 0; j < n; j++) {
        //     System.out.print((char)('A' + j));
        //   }
        //   System.out.println();
  
        // }
        // int i = 1;
        // while (i<=n) {
        //     int j = 1;
        //     while (j<=i) {
        //         System.out.print((char)('A' + i-1));
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        // int i = 1;
        // while (i<=n) {
        //     int j = 1;
        //    char x = (char)('A' + i-1);
        //     while (j<=i) {
        //         System.out.print(x);
        //         j++;
        //         x++;
        //     }
        //     i++;
        //     System.out.println();
        // }

        // int i = 1;
        // while (i<=n) {
        //     int j = 1;
        //     char x = (char)('A' + n-1);
        //     while (j<=i) {
        //         System.out.print(x);
        //         j++;
        //         x++;
        //     }
        //     i++;
        //     System.out.println();
        //   }

        // int i = 1;
        // while (i<=n) {
        //     int k = 1;
        //     while (k<=n-i) {
        //         System.out.print(" ");
        //         k++;
        //     }
        //     int j = 1;
        //     while (j<=i) {
        //         System.out.print(j);
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=n-i+1) {
                System.out.print(n-i+1);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
