package strings;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LogestSubStringWithUniqueCharacter {


    public int lengthOfLongestSubstring(String s) {

        Set<Character> uniqueSet = new HashSet<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < s.length()) {
            if (!uniqueSet.contains(s.charAt(j))) {
                uniqueSet.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j - i);
            } else {
                uniqueSet.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}
