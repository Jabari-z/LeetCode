package leetcode

/*
 * @lc app=leetcode id=27 lang=golang
 *
 * [27] Remove Element
 */

// @lc code=start
func removeElement(nums []int, val int) int {

	// 新数列的index
	newLen := 0
	// for i := 0; i < len(nums); i++ {
	// 	if nums[i] == val {
	// 		continue
	// 	}
	// 	nums[newLen] = nums[i]
	// 	newLen++
	// }
	for i := 0; i < len(nums); i++ {
		if nums[i] != val {
			nums[newLen] = nums[i]
			newLen++
		}
	}
	return newLen
}

// @lc code=end
