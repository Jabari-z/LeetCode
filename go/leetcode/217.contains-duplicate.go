package leetcode

/*
 * @lc app=leetcode id=217 lang=golang
 *
 * [217] Contains Duplicate
 */

// @lc code=start
func containsDuplicate(nums []int) bool {
	m := make(map[int]struct{})
	for _, v := range nums {
		if _, ok := m[v]; ok {
			return true
		}
		m[v] = struct{}{} //struct{}{} / 这一点注意一下
	}
	return false
}

// @lc code=end
