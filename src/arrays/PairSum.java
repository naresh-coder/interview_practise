package arrays;

public class PairSum {
    public static void main(String[] args) {
        int x = divisibleSumPairs(6,3, new int[]{1,3,2, 6, 1, 2});

        System.out.println("x = " + x);
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
            int count = 0;
            for(int i = 0 ;i < n ; i++){
                for(int j = n-1 ;i < j; j--){
                    int sum = ar[i]+ar[j];
                    if(sum%k == 0 ){
                        count++;
                    }
                }
            }
            return count;
        }

}
