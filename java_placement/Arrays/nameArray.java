package Arrays;

import java.util.Scanner;

public class nameArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            String[] names = new String[size];

            //input
            for (int i = 0; i < size; i++) {
                names[i] = sc.next();
            }

            //output
            for (int i = 0; i < size; i++) {
                System.out.println("Name " + (i+1) + " is " + names[i]);            
            }
        }

    }
}
