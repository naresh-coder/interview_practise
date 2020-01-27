package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RepeadString {

    public static void main(String[] args) {

        // long

        long r = repeatedString("abc",10);

        System.out.println(r);


    }

    static long repeatedString(String s, long n) {


        Map<Character, Long> map = new LinkedHashMap<>();
        int length = s.length();

        if (length == 0) return 0;
        if (length == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0l) + 1);
            j++;
            if (j == length) {
                j = 0;
            }
        }

        Set<Character> set = map.keySet();
        char key = '\0';

        for (Character c : set) {
            key = c;
            break;
        }

        return map.get(key);


    }
}
