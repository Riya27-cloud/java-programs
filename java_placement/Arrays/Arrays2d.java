package Arrays;

import java.util.Scanner;

public class Arrays2d {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter rows and columns size: ");
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int x = sc.nextInt();

            int[][] numbers= new int[rows][cols];

            //input
            System.out.println("Enter the elements of an array");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++){
                   numbers[i][j] = sc.nextInt();
                }
            }

            //output
            System.out.println("2D Array will be: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++){
                    if(x == numbers[i][j])
                    System.out.print("x is found at location: [" + i + "]" + "[" + j + "]");
                }
                System.out.println();
   }
        }
}

}
