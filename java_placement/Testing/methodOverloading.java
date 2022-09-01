package Testing;

public class methodOverloading {
    public static int sum(int a, int b){
        return a+b;
    }

    public static double sum(double a, double b) {
        return a+b;
    }

    public static int sum(int a) {
        return a;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println(sum(a, b));
        System.out.println(sum(a));
        System.out.println(sum(3.4, 4));

    }
}
