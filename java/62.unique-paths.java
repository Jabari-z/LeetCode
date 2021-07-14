/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */


class Solution62 {
// @lc code=start
// class Solution {
    public int uniquePaths_1(int m, int n) {
        if(m<=0 || n<=0){
            return 0;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0]=1;//到达 最左边的列 的任意位置 只有一种
        }
        for (int i = 0; i < n; i++) {
            dp[0][i]=1; //到达 最上边的行 的任意位置 只有一种
        }

        // dp 推倒
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
            
        }
        return dp[m-1][n-1];
    }
    public int uniquePaths(int m, int n) {
        if(m<=0 || n<=0){
            return 0;
        }//⬆️非法
        if(n==1||m==1){
            return 1;
        }//⬆️出口
        
        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    }

}
// @lc code=end

