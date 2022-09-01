package Arrays;

import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }  
        }
        System.out.println("The Sprial order Matrix is");          
        int row_start = 0;
        int row_end = m-1;
        int col_start = 0;
        int col_end = n-1;
        while (row_start <= row_end && col_start <= col_end) {
            for (int col = col_start ; col <= col_end; col++) {
                System.out.print(matrix[row_start][col] + " ");
            }
            row_start++;

            for (int row = row_start; row <= row_end; row++) {
                System.out.print(matrix[row][col_end] + " ");
            }
            col_end--;

            for (int col = col_end; col <= col_start; col--) {
                System.out.print(matrix[row_end][col] + ' ');
            }
            row_end--;

            for (int row = row_end; row <= row_start; row--) {
                System.out.print(matrix[row][col_start] + ' ');
            }
            col_start++;
            System.out.println();
            sc.close();
        }
    }
}
