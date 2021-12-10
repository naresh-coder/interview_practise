package com.startup;

public class UniqueTwoNUmberiNArray {


    public static void main(String[] args) {
   solve(new int[]{1, 2, 3, 1, 2, 4});
    }

    public static int[] solve(int[] A) {

        int sum = A[0];
        for(int i = 1 ;i < A.length; i++){

            sum = sum ^ A[i];

        }

        int pos = 0;

        while(sum > 0){
            if((sum&1)== 1){
                break;
            }
            pos++;
            sum= sum >>1;
        }

        int[] set1 = new int[A.length];
        int[] set2 = new int[A.length];

        int i =0;
        int isum =0;
        int j=0;
        int jsum=0;

        for(int a : A){
            if(((a & (1 << (pos))) > 0)){
                set1[i++] =a;
            }
            else {
                set2[j++] =a;
            }

        }
        for (int n1: set1   ) {
            isum = isum ^ n1;
        }
        for (int n2: set2   ) {
            jsum = jsum ^ n2;
        }

       int[] result = new int[2];
        result[0]=isum;
        result[1]=jsum;

        return result;

    }
}
