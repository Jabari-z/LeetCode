/*
 * @lc app=leetcode id=7 lang=golang
 *
 * [7] Reverse Integer
 */
package leetcode

// @lc code=start

//lint:file-ignore U1000 Ignore all unused code, it's generated
func reverse(x int) int {

	var res int

	for x != 0 {
		res = res*10 + x%10
		x = x / 10
	}
	// integer range [-231, 231 - 1], then return 0.
	if res > 1<<31-1 || res < (-1<<31) {
		return 0
	}

	return res
}

// @lc code=end
