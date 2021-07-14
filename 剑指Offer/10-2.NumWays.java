class Solution {
    public int numWays(int n) {
        // // 递归
        // if(n<=0) return 1;
        // else if(n==1) return 1;
        // else if(n==2) return 2;
        // return numWays(n-1)+numWays(n-2);


        // dp
        if(n<=0) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];

        // // 优化dp  节省存储空间
        // if(n<=0) return 1;
        // int m1 =1;
        // int m2 = 1;
        // int sum;
        // for(int i = 2;i<=n;i++){
        //     sum = (m2+m1)%1000000007;
        //     m2 = m1;
        //     m1 = sum;
        // }
        // return sum;
    }
}