/*
 * @lc app=leetcode id=39 lang=golang
 *
 * [39] Combination Sum
 */

package LeetCode

// @lc code=start
func combinationSum(candidates []int, target int) [][]int {
	res := make([][]int, 0)
	if target == 0 || len(candidates) == 0 {
		return res
	}
	oneres := make([]int, 0)
	res = dfs(0, oneres, candidates, target, res)

	return res
}
func dfs(cur int, oneres []int, candidates []int, target int, res [][]int) [][]int {
	if cur == target {
		res = append(res, oneres)
		return res
	}
	var pre int
	if len(oneres) > 0 {
		pre = oneres[len(oneres)-1]
	}
	for _, candidate := range candidates {
		if cur+candidate <= target && candidate >= pre {
			tmp := make([]int, 0)
			tmp = append(tmp, oneres...)
			tmp = append(tmp, candidate)

			res = dfs(cur+candidate, tmp, candidates, target, res)
		}
	}
	return res
}

// @lc code=end
