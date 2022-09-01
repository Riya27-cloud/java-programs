package BasicPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 18;
        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i ==0){
                isPrime = false;
                break;                      //break keyword helps to exit out of the loop
            }
        }
        if (isPrime) {
            if (n==1) {
                System.out.println("This is not a Prime Number");
            } else {
                System.out.println("This is a Prime Number");                
            }
        } else {
            System.out.println("This is not a Prime number");            
        }
    }
}

