package RecursionAndDynamicProgramming;

public class TripleStep {
    public static void main(String[] args) {
        int ways = tripleStep(6);
        System.out.println(ways);
    }
    public static int tripleStep(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
}
