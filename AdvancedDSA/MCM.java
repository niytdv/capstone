public class MCM {
    static int mcm(int[] arr, int i, int j) {

        // 
        int dp[][] = new int[j + 1][j + 1];
        for (int l = 2; l <= j; l++) {
            for (int k = 1; k <= j - l + 1; k++) {
                int m = k + l - 1;
                dp[k][m] = Integer.MAX_VALUE;

                for (int n = k; n < m; n++) {
                    dp[k][m] = Math.min(dp[k][m], dp[k][n] + dp[n + 1][m] + arr[k - 1] * arr[n] * arr[m]);
                }
            }
        }
        return dp[i][j];
    }

    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};
        int n = arr.length;

        System.out.println(mcm(arr, 1, n - 1));
    }
    
}
