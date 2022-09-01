package Strings;

//import java.util.Scanner;

public class TakeInput {
    /* public static void inputString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();                        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str + " " + str.length());
        System.out.println(str1 +" " + str1.length());
        System.out.println(str2);
        sc.close();
    } */

    public static void printCharacters(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
     }

    public static void main(String[] args) {
        //inputString();
        printCharacters("Riya Gupta");
    }
}
