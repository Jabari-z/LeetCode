
public class MaxSubArray {
    public int maxSum(int[] nums) {
        // dp i是以 第i个字母结束的 最大数组
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], 0) + nums[i];
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }

    // 改进 降低空间复杂度
     public int maxSubArray2(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(new MaxSubArray().maxSum(nums));
    }
}
