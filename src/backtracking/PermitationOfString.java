package backtracking;

public class PermitationOfString {
    public static void main(String[] args) {

        permitation("abc", 0, 3);

    }

    static void permitation(String input, int index, int length) {

           if (index == length) {
            System.out.println(input);
            return;
        }
        for (int i = index; i < length; i++) {
            input = swap(input, index, i);
            permitation(input, index+1, length);
        }

    }

    private static String swap(String input, int i, int index) {

        char[] chars = input.toCharArray();
        char temp = chars[i];
        chars[i] = chars[index];
        chars[index] = temp;

        return String.valueOf(chars);


    }
}
