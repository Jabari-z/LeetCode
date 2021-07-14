package leetcode

/*
 * @lc app=leetcode id=3 lang=golang
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

// 滑动窗
func lengthOfLongestSubstring(s string) int {
	if len(s) == 0 {
		return 0
	}
	var freq [256]int
	result, left, right := 0, 0, -1

	for left < len(s) {
		// 滑动窗口的右边界不断向右扩大窗口
		if right+1 < len(s) && freq[s[right+1]-'a'] == 0 {
			freq[s[right+1]-'a']++
			right++
		} else {
			// 一旦出现了重复字符，就需要缩小左边界，
			//直到重复的字符移出了左边界，
			//然后继续移动滑动窗口的右边界。
			freq[s[left]-'a']--
			left++
		}
		result = max(result, right-left+1)
	}
	return result
}
func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

// @lc code=end

func lengthOfLongestSubstring_(s string) int {
	if len(s) == 0 {
		return 0
	}
	var bitSet [256]bool
	result, left, right := 0, 0, 0
	for left < len(s) {
		// 右侧字符对应的 bitSet 被标记 true，说明此字符在 X 位置重复，需要左侧向前移动，直到将 X 标记为 false
		if bitSet[s[right]] {
			bitSet[s[left]] = false
			left++
		} else {
			bitSet[right] = true
			right++
		}
		if result < right-left {
			result = right - left
		}
		if left+result >= len(s) || right >= len(s) {
			break
		}
	}
	return result
}
