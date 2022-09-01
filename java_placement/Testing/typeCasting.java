package Testing;

public class typeCasting {
    public static void main(String[] args) {
        /*
         * byte by = 50;
         * // b = b * 50; (this is wrong as operator has converted byte into int which
         * is not possible)
         * System.out.println(by);
         */

        /*
         * double a = 55.5;
         * int b = 55;
         * a = a % 10;
         * b = b % 10;
         * System.out.println(a);
         * System.out.println(b);
         */

        /*
         * int var1 = 50;
         * int var2 = Integer.MAX_VALUE;
         * if((var1/0)==var2){
         * System.out.println("Hello");
         * }
         * else {
         * System.out.println("Hii");
         * }
         * int a = 5;
         * int b = -5;
         * System.out.println(a*b<0);
         */

        int a = 50, b = 20;
        if (a > b) {
            if (a > 100)
                System.out.println("Ace");

            if (b < 100)
                b = 50;
        } else if (a == b)

            System.out.println("King");

        else
            System.out.println("Queen");

    }
}
