package activity46;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Activity46 {

    public static String getSandwich(String str) {
        int len = str.length();
        String tmpString = "";
        String finalString = "";
        int start = 0;
        int finish = 0;
        boolean found = false;
        if (len <= 10) {
            return "''";
        }
        for (int i = 0; i < len - 4; i++) {
            tmpString = str.substring(i, i + 5);
            if (tmpString.equals("bread") && found == true) {
                finish = i;
            }
            if (tmpString.equals("bread") && found == false) {
                start = i + 5;
                found = true;
            }
        }
        finalString = str.substring(start, finish);
        return finalString;
    }

    public static void main(String[] args) {
        String word1 = "breadjambread";
        String word2 = "xxbreadjambreadyy";
        String word3 = "xxbreadyy";
        System.out.println(getSandwich(word1));
        System.out.println(getSandwich(word2));
        System.out.println(getSandwich(word3));
    }
}
