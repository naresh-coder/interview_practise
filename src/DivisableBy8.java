package com.startup;

public class DivisableBy8 {

    public static void main(String[] args) {
        System.out.println(solve("16"));
        System.out.println(titleToNumber("AA"));
    }


    public static int titleToNumber(String A) {

        int l  = A.length();
        int r = 0;

        for(int i =0 ;i < l ; i++){

            r = r + ( (A.charAt(i) -'A')+1)*(int)Math.pow(26,l-1-i);

        }
        return r;

    }

    public static  int solve(String A) {
        int l = A.length();
        int r = 0;
        String str = null;

        if( l >= 3){
            str= A.substring(l-3,l);
        }
        else if(l>=2){
            str =A.substring(l-2,l);
        }
        else if(l>=1){
            str =A.substring(l-1,l);
        }
        r = Integer.parseInt(str);

        return (r%8==0)?1:0;
    }

    /*public static  int solve(String A) {
        int s = 0;
        int l = A.length();
        int r = 0;
        for (int i = 0; i < l; i++) {
            r = (int) ((int) (A.charAt(i) - '0') * Math.pow(10, l - 1 - i));
            s = r % 8 + s;
        }
        return s % 8 == 0 ? 1 : 0;
    }*/
}
