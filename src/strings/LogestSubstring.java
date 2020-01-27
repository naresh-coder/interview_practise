package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogestSubstring {

    public static void main(String[] args) {

        String splt = "He is a very very good boy, isn't he?\n";

       // String[] strings = splt.split("\\s|,|\\?|\\.|\\@|\\_|\\'");
        String[] strings = splt.split("\\s|\\!|\\,|\\?|\\.|\\_|\\@");
//!,?._'@]
        System.out.println(Arrays.toString(strings));





//        Set<Character> givenString = new HashSet<>();
//        String s = "abcabcbb";
//        int r = getShortestSubstringForGivenString(s);
//        System.out.println(r);


    }

    private static int getShortestSubstringForGivenString(String s) {
        int n = s.length();
        int max_distinct = max_distinct_char(s, n);
        int minl = n;   // result


        String substring = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= s.length(); j++) {
                if (i <= j) {
                    substring = s.substring(i, j);
                } else {
                    substring = s.substring(j, i);

                }
                int subs_length = substring.length();
                int sub_distinct_char = max_distinct_char(substring, subs_length);

                // We have to check here both conditions together
                // 1. substring's distinct characters is equal
                //    to maximum distinct characters
                // 2. substing's length should be minimum
                if (subs_length < minl && max_distinct == sub_distinct_char) {
                    minl = subs_length;
                }
            }
        }
        return minl;
    }

    static int max_distinct_char(String str, int n) {

        // Initialize all character's count with 0
        int NO_OF_CHARS = 256;
        int count[] = new int[NO_OF_CHARS];

        // Increase the count in array if a character
        // is found
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

        int max_distinct = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if (count[i] != 0) {
                max_distinct++;
            }
        }

        return max_distinct;
    }

//    private static void getCharArrayforString(Set<Character> givenString, String s) {
//        for (int i = 0; i < s.length(); i++) {
//           givenString.add(s.charAt(i));
//    }
//
//    private static int[] getCharArrayforString(String s) {
//        int[] givenString = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            int index = s.charAt(i) - 'a';
//            if (givenString[index] == 0)
//                givenString[index]++;
//        }
//        return givenString;
//    }

    public static int logestSubstring(String s) {


        return 0;
    }
}
