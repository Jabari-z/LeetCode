package leetcode

/*
 * @lc app=leetcode id=189 lang=golang
 *
 * [189] Rotate Array
 */

// @lc code=start
func rotate(nums []int, k int) {
	// 1.左边旋转 右边旋转
	// 2. 全部旋转
	length := len(nums)
	k = k % length

	reverseArray(nums, 0, length-1)
	reverseArray(nums, 0, k-1)
	reverseArray(nums, k, length-1)
}

func reverseArray(nums []int, start, end int) {
	i, j := start, end
	for i < j {
		nums[i], nums[j] = nums[j], nums[i]
		i++
		j--
	}
}

// @lc code=end
