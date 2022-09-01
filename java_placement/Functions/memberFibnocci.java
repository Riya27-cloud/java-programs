package Functions;

public class memberFibnocci {
    public static boolean checkFibnocci(int n) {
        int a = 0, b = 1, c;
        while (a<n) {
            c = a+ b;
            a = b;
            b = c;
        }
        if (a==n) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(checkFibnocci(6));
    }
}
