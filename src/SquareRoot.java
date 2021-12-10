package com.startup;

import java.util.ArrayList;
import java.util.List;

public class SquareRoot {


        public static void main(String[] args) {
          int x=  square(36);
            System.out.println(x);
        }

        public static int square(int value){
             int l = 1;
             int r = value;
             int cnt =0;

             int mid = 0;

             while(r > l ){

                 mid =  (l+r)/2;
                 cnt++;

                 if(mid * mid == value){
                     return  mid;
                 }
                 if(mid * mid > value){
                     r = mid-1;
                 }

                 if(mid * mid < value){
                     l = mid+ 1;

                 }

             }
            System.out.println(cnt);
             return 0;
        }

}
