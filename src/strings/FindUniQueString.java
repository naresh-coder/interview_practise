package strings;

import java.util.HashSet;
import java.util.Set;

public class FindUniQueString {

    public static void main(String[] args) {
      /*System.out.println(uniqueString("dvdf"));
        System.out.println(uniqueString("abcdaabbcd"));
        System.out.println(uniqueString("abcabcbb"));*/
    }
    public static int uniqueString(String given) {

        int[] INPUT  = new int[26];

        for(int i = 0; i < given.length(); i++){
           // ++INPUT[given.g]
        }










        return  0;
    }






//    public static String uniqueString(String given) {
//
//        StringBuffer distSubstring = new StringBuffer();
//       // Set<String> stringSet = new HashSet<>();
//        String result = "";
//        Set<Character> set = new HashSet<>();
//        int charIndex = 0;
//
//        for (int i = 0; i < given.length(); i++) {
//            if (!set.contains(given.charAt(i))) {
//                set.add(given.charAt(i));
//                distSubstring.append(given.charAt(i));
//            } else {
//                if (distSubstring.length() > result.length()) {
//                   result = distSubstring.toString();
//                }
//                charIndex = distSubstring.toString().indexOf(given.charAt(i)) + 1;
//                distSubstring = new StringBuffer(distSubstring.toString().substring(charIndex));
//                set.clear();
//                set.add(given.charAt(i));
//                distSubstring.append(given.charAt(i));
//            }
//        }
//        if (distSubstring.length() > result.length()) {
//            result = distSubstring.toString();
//        }
//
////        String temp = "dvdf";
////        System.out.println(temp.substring(temp.indexOf('v') + 1));
////        System.out.println(result);
//
//
//        return result;
//    }
}
