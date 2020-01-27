package strings;

public class StringPrefix {

    public static void main(String[] args) {
        //  longestCommonPrefix(new String[]{"aa", "aa"});


        String sssss = "abced";
        System.out.println(sssss.indexOf("a"));

        //longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }

   /* public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        String str = strs[0];
        int j = 0;
        StringBuffer br = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            String prefix = str.substring(0, i + 1);
            while (strs[j++].indexOf(prefix) == 0)
               // prefix = str.substring()
        }
        System.out.println(br.toString());

        return br.toString();

    }*/
}
