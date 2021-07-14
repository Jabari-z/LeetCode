package leetcode

/*
 * @lc app=leetcode id=70 lang=golang
 *
 * [70] Climbing Stairs
 */

// @lc code=start
func climbStairs(n int) int {
	// n = 1     - > 1
	// n = 2     - > 2
	// n = 3     - > 3
	// n[i] = n[i-1]
	// 斐波那契数列
	ways := make([]int, n)
	ways[0] = 1
	ways[1] = 2
	for i := 2; i < n; i++ {
		ways[i] = ways[i-1] + ways[i-2]
	}
	return ways[n-1]
}

// @lc code=end
