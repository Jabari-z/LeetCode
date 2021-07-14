package leetcode

/*
 * @lc app=leetcode id=122 lang=golang
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
func maxProfit(prices []int) int {
	n := len(prices)
	// 没有差价可以做
	if n < 2 {
		return 0
	}
	// 动态规划dp
	// dp[i][0] i+1 天交易完 没有股票了
	// dp[i][1] i+1 天交易完 持有股票了
	dp := make([][2]int, n)
	//初始状态
	dp[0][0] = 0          // 没操作
	dp[0][1] = -prices[0] // 买了股票
	for i := 1; i < n; i++ {
		//状态更新

		////比较          没操作           卖掉了股票
		dp[i][0] = max(dp[i-1][0], dp[i-1][1]+prices[i])
		////比较          没操作           买上了股票
		dp[i][1] = max(dp[i-1][1], dp[i-1][0]-prices[i])
	}
	// 最后 是手中没有股票
	return dp[n-1][0]
}

// maxProfit1 优化 只与两个值有关
func maxProfit1(prices []int) int {
	n := len(prices)
	// 没有差价可以做
	if n < 2 {
		return 0
	}
	var hold, noHold int
	hold = -prices[0]
	noHold = 0
	for i := 1; i < n; i++ {
		//状态更新

		////比较          没操作           卖掉了股票
		noHold = max(noHold, hold+prices[i])
		////比较          没操作           买上了股票
		hold = max(hold, noHold-prices[i])
	}
	// 最后 是手中没有股票
	return noHold
}

// @lc code=end
