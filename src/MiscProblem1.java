package com.startup;

public class MiscProblem1 {

    public static void main(String[] args) {

      int x =solve(111);

        System.out.println(x);

    }

    public static int solve(int a){

        if(a==0){
            return 0;
        }
        return a%10+solve(a/10);

    }
}
