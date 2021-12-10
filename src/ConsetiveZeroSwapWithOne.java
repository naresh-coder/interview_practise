package com.startup;

public class ConsetiveZeroSwapWithOne {

    public static void main(String[] args) {

    solve("1101001100101110");

    }

    public static int solve(String A) {


        int l = A.length();

        int count = 0;
        int ans =0;

        for (int i = 0; i < l; i++) {
            if (A.charAt(i) == '1') {
                count++;
            }
        }


        int ls[] = new int[A.length()];
        int rs[] = new int[A.length()];
        if( A.charAt(0) =='1'){
            ls[0] = 1;
        }
        else
         ls[0] =0;

        if(A.charAt(l-1)=='1'){
            rs[l-1] =1;
        }
        else
            rs[l-1] = 0;

        for(int i =1 ;i < l ; i++){
            if(A.charAt(i)=='1'){
                ls[i] = ls[i-1]+1;
            }
            else{
                ls[i] =0;
            }
        }

        for (int i = l - 2; i >= 0; i--) {
            if (A.charAt(i) == '1'){
                rs[i] = rs[i + 1] + 1;
            }
            else{
                rs[i] = 0;
            }

        }


        for (int  i = 0; i <l; i++) {

            if(A.charAt(i)=='0'){

                int L = 0;
                int R =0;
                if( i > 0){
                    L = ls[i-1];
                }
                if(i < l-1){
                    R = rs[i+1];
                }

                if(L+R < count){
                    ans = Math.max(ans,L+R+1);
                }
                else{
                    ans = Math.max(ans,L+R);
                }

            }

        }


        return ans;
    }
}
