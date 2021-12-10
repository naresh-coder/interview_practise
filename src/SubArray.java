package com.startup;

public class SubArray {

    public static void main(String[] args) {
        SubArray subArray = new SubArray();

        subArray.subarraySum( new int[] {1,2,3});
    }
    public long subarraySum(int[] A) {
        long ans = 0;
        int n = A.length;
        for (int i = 0; i < n; i++)
            ans += (long)A[i] * (i + 1) * (n - i);
        return ans ;
    }

}
