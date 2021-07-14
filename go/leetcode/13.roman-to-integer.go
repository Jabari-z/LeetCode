package leetcode

/*
 * @lc app=leetcode id=13 lang=golang
 *
 * [13] Roman to Integer
 */

// @lc code=start

var roman = map[string]int{
	"I": 1,
	"V": 5,
	"X": 10,
	"L": 50,
	"C": 100,
	"D": 500,
	"M": 1000,
}

func romanToInt(s string) int {
	if s == "" {
		return 0
	}
	num, lastint, totle := 0, 0, 0
	for i := 0; i < len(s); i++ {
		// 最右边的字符
		char := s[len(s)-(i+1) : len(s)-i]
		// 对应的数字
		num = roman[char]
		if num < lastint {
			totle = totle - num
		} else {
			totle = totle + num
		}
		lastint = num
	}
	return totle
}

// @lc code=end
