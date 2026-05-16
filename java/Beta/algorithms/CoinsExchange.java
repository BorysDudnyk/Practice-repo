// DP: Coin Change combinations

public class CoinExchange {
  public long exchange(int[] type, int n) {

    if (n <= 0 || type == null || type.length == 0) {
      return 0;
    }

    long[] dp = new long[n + 1];
    dp[0] = 1;

    for (int coin : type) {
      
      if (coin <= 0) {
        return 0;
      }

      for (int i = coin; i <= n; i++) {
        dp[i] += dp[i - coin];
      }
    }

    return dp[n];
  }
}
