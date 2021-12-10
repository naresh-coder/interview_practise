package com.startup;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllArray {


    public static void main(String[] args) {

        solve(new int[]{1, 2, 3, 4, 5},2);
    }


    public static int solve(int[] A, int B) {

         Arrays.sort(A);
        int l = A.length;

        int leftsum = 0;
        int rightsum =0;

        for(int i = 0; i < B ; i++){
            leftsum+=A[i];
        }

        //  int  b= B;
        for(int j= 0; j < l ; j++){
            rightsum+=A[j];
        }


        int s2 = rightsum-leftsum;

        return Math.abs(s2-leftsum);
    }

        public Long subarraySum(ArrayList<Integer> A) {

            int n = A.size();

            long total = (long) (Math.pow(2,n)-1);

            long allsum =0;
            for(long  i = 0; i < total; i++){
                int sum = 0;
                for(int j =0; j< n; j++){
                    if((i&j)==1){
                        sum = sum+A.get(j);
                    }
                }
                allsum =allsum+sum;
            }

            return allsum;



    }

}
