package Strings;

public class ReverseString {
    public static void reverseString(String str) {
        String reversedString = " ";
      /*  for (int i = str.length()-1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        System.out.println(reversedString); */

        for (int i = 0; i < str.length(); i++) {
            reversedString = str.charAt(i) + reversedString;
        }
        System.out.println(reversedString);
    }
    public static void main(String[] args) {
        String str = "Riya Gupta";
        reverseString(str);
    }
}
