package DSA;

import java.util.Scanner;

public class Primality {
    public static boolean prime(int n){
        int div =2;
        boolean isPrime = true;
        while(div<=n-1){
            if (n%div == 0) {
                isPrime = false;
                break;
            }
            div++;
        }
        return isPrime;
        // if (isPrime) {
        //     return true;
        // } else {
        //     return false;
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n));
        sc.close();
    }
}
