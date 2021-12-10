package com.startup;

public class ReverSbit {

    public static void main(String[] args) {
        System.out.println(reverse(3));
    }


    public static long reverse(long a) {

        long rev = 0;
        long n = a;
        while (n > 0) {
           // rev <<= 1;

              rev =  rev| (n &1);

            n = n >> 1;

        }
        return rev;
    }
}
