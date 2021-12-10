package com.startup;

public class AddBinaryString {

    public static void main(String[] args) {
        addBinary("1010110111001101101000","1000011011000000111100110");
    }

        public static  String addBinary(String A, String B) {

            int al = A.length();
            int bl = B.length();
            String d ="";
            String d1 ="";

            int diff = bl-al;

            if(diff > 0){
                while(diff > 0){
                    d ="0"+d;
                    diff--;
                }

                d=d+A;
                d1 =B;
            }
            else{
                while(diff < 0){
                    d ="0"+d;
                    diff++;
                }

                d=d+B;
                d1=A;
            }

            int x =d.length() -1;
            int carry = 0;
            int q =0;
            String s ="";
            for(; x >=0; x--){
             int input = Integer.parseInt(String.valueOf(d.charAt(x)))+Integer.parseInt(String.valueOf(d1.charAt(x)));
              q = (input+carry)%2;
              s=q+s;
              carry = (input+carry)/2;

            }
            if(carry ==1)
                s=carry+s;

         return s;


    }

    public String addBinaryEfficient(String A, String B) {
        int nA, nB;
        char res[];
        int i, j, k;
        nA = A.length();
        nB = B.length();
        res = new char[Math.max(nA, nB) + 1];
        k = Math.max(nA, nB);
        i = nA - 1;
        j = nB - 1;
        int sum = 0, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            sum = carry;
            if (i >= 0)
                sum += (A.charAt(i) - '0');
            if (j >= 0)
                sum += (B.charAt(j) - '0');
            res[k] = (char) ((sum % 2) + '0');
            carry = sum / 2;
            i--;
            j--;
            k--;
        }
        if (res[0] == '1')
            return new String(res);
        int len = Math.max(nA, nB);
        return new String(res, 1, len);
    }
}
