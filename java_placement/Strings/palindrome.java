package Strings;

public class palindrome {
    public static boolean checkPalindrome(String str) {
       /* String reversString = "";
        for (int i = str.length()-1; i>=0; i--) {
            reversString += str.charAt(i);
        }
        System.out.println(reversString);
        if (str.equals(reversString)) {
            return true;
        }
        else{
            return false;
        } */

        int i = 0, j = str.length()-1;
        while (i<=j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        // String str = "abbbbba";
        String str2 = "malayalam";
        System.out.println(checkPalindrome(str2));
    }
}
