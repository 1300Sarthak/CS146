public class Lab8 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        java.util.Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Lab8 obj = new Lab8();
        System.out.println(obj.coinChange(new int[] { 1, 2, 5 }, 11)); // Should return 3
        System.out.println(obj.coinChange(new int[] { 2 }, 3)); // Should return -1
        System.out.println(obj.coinChange(new int[] { 1 }, 0)); // Should return 0
    }
}
