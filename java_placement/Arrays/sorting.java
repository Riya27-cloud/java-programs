package Arrays;

import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int sort[] = new int[size];
            boolean isAscending = true;
            for (int i = 0; i < sort.length; i++) {
                sort[i] = sc.nextInt();
            }
            for (int i = 0; i < sort.length-1; i++) {
                if(sort[i] > sort[i+1]){
                    isAscending = false;
                }
            }
            if (isAscending) {
                System.out.println("Array is in ascending order");
            } else {
                System.out.println("Array is not in ascending order");            
            }
        }
    }
}
