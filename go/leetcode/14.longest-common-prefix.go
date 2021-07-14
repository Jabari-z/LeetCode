package leetcode

import "strings"

/*
 * @lc app=leetcode id=14 lang=golang
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
func longestCommonPrefix(strs []string) string {
	if len(strs) == 0 {
		return ""
	}
	ans := strs[0]
	for i, v := range strs {
		if v == "" {
			return ""
		}
		if i == 0 {
			continue
		}
		var minLen int
		if len(ans) < len(v) {
			minLen = len(ans)
		} else {
			minLen = len(v)
		}

		for j := minLen; j > 0; j-- {
			if strings.HasPrefix(v, ans[0:j]) {
				ans = ans[0:j]

			}
			ans = ans[0:j]
			if j == 1 {
				return ""
			}
		}
	}
	return ans
}

// @lc code=end
