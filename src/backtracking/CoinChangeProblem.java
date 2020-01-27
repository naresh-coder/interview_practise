package backtracking;

public class CoinChangeProblem {


    public static void main(String args[])
    {
        int coins[] = {1, 3, 2};
        int noOfCoins = coins.length;
        int amount = 5;
        System.out.println(numberOfWaysCoinChange(coins, noOfCoins, amount));
    }


    public static int numberOfWaysCoinChange(int coins[], int noOfCoins, int amount )
    {
        // DP[i] will be storing the number of solutions for
        // value i. We need amount+1 rows as the DP is constructed
        // in bottom up manner using the base case (amount = 0)
        int DP[]=new int[amount+1];

        // Base case (If given value is 0)
        DP[0] = 1;

        // Pick all coins one by one and update the DP[] values
        // after the index greater than or equal to the value of the
        // picked coin
        for(int i=0; i < noOfCoins; i++) {
            int coin = coins[i];
            for(int j = coin; j<=amount; j++)
                if(j- coin > 0)
                  DP[j] += DP[j- coin];
                else
                    DP[j]+=DP[j-1];
        }


        return DP[amount];
    }

    /**
     *  int coinChange(vector<int>& coins, int amount) {
     *         int Max = amount + 1;
     *         vector<int> dp(amount + 1, Max);
     *         dp[0] = 0;
     *         for (int i = 1; i <= amount; i++) {
     *             for (int j = 0; j < coins.size(); j++) {
     *                 if (coins[j] <= i) {
     *                     dp[i] = min(dp[i], dp[i - coins[j]] + 1);
     *                 }
     *             }
     *         }
     *         return dp[amount] > amount ? -1 : dp[amount];
     *     }
     */

}
