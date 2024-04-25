from typing import List


class Lab8:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [amount + 1] * (amount + 1)
        dp[0] = 0
        for a in range(1, amount + 1):
            for coin in coins:
                if coin <= a:
                    dp[a] = min(dp[a], dp[a - coin] + 1)
        return dp[amount] if dp[amount] != amount + 1 else -1

# Example usage:
# sol = Solution()
# print(sol.coinChange([1, 2, 5], 11))  # Should return 3
# print(sol.coinChange([2], 3))         # Should return -1
# print(sol.coinChange([1], 0))         # Should return 0
