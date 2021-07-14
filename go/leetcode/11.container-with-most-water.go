package leetcode

/*
 * @lc app=leetcode id=11 lang=golang
 *
 * [11] Container With Most Water
 */

// @lc code=start
func maxArea(height []int) int {
	left, right := 0, len(height)-1
	var maxRes int
	for left < right {

		res := min(height[left], height[right]) * (right - left)
		if res > maxRes {
			maxRes = res
		}
		if height[left] < height[right] {
			left++
		} else {
			right--
		}
	}
	return maxRes
}
func min(a, b int) int {
	if a > b {
		return b
	}
	return a
}

// @lc code=end
