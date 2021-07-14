package leetcode

/*
 * @lc app=leetcode id=53 lang=golang
 *
 * [53] Maximum Subarray
 */

// @lc code=start
func maxSubArray(nums []int) int {
	//dp 问题
	//dp[i] 表示 0 - i中 区间 和最大
	//dp[i] = nums[i] + dp[i-1] ( dp[i-1]> 0 )
	//dp[i] = nums[i]          ( dp[i-1]<=0 )

	if len(nums) == 0 {
		return 0
	}
	dp, res := make([]int, len(nums)), nums[0]
	dp[0] = res
	for i := 1; i < len(nums); i++ {
		if dp[i-1] > 0 {
			dp[i] = nums[i] + dp[i-1]
		} else {
			dp[i] = nums[i]
		}
		// MAX
		res = max(res, dp[i])
	}
	return res
}

// @lc code=end
