package Functions;

import java.util.Scanner;

public class Greatest {
    public static int printGreatest(int num1, int num2) {
        if (num1>num2) {
            return num1;
            //System.out.println(num1 + " is greater than " + num2);
        } else {
            //System.out.println(num2 + " is greater than " + num1);            
            return num2;
        }
    }
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            int num = printGreatest(num1, num2);
            System.out.println(num + " is greatest!");
        }
    }
}
