package com.startup;

public class Main {

    public static void main(String[] args) {

        Short v1 = 1;
        System.out.println(v1=='1');

      // findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
    }

        public static int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int count= 0;

            for(int number : nums){

                if(number == 1){
                    count++;
                }
                else{
                    max = Math.max(max,count);
                    count=0;
                }
            }

            return max;
        }

}
