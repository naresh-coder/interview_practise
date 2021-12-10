package com.startup;

public class FizzBizzIWht {

    public static void main(String[] args) {

        fizzBuzz(3);

    }

    public static String[] fizzBuzz(int A) {

        String[] r = new String[A];
        int j = 0;
        for(int i = 0; i < A; i++){
                 j = i+1;
            if( j%3 == 0 && j%5==0){
                r[i] ="FizzBuzz";
            }
            else if(j%5==0){
                r[i] = "Buzz";
            }
            else if(j%3==0){
                r[i]="Fizz";
            }
            else{
                r[i]=""+j;
            }

        }
        return r;

    }
}
