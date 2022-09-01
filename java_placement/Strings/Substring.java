package Strings;

public class Substring {
    public static void possibleSubstring(String str) {
        /*for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        } */
        for (int len = 1; len < str.length(); len++) {
            for (int start = 0; start <= str.length()-len; start++) {
                int end = start+len-1;
                System.out.println(str.substring(start, end+1));
            }
        } 

    }
    public static void main(String[] args) {
        String str = "Riya";
        possibleSubstring(str);
    }
}
