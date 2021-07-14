/*
 * @lc app=leetcode id=1 lang=golang
 *
 * [1] Two Sum
 */

// @lc code=start
package leetcode

func twoSum(nums []int, target int) []int {
	// 一个map
	m := make(map[int]int)
	//遍历每一个数字
	for i := 0; i < len(nums); i++ {
		// 需要另一个数字才能 才能等于指定数字
		another := target - nums[i]
		// 查询这个数字是否存在于map中
		if _, ok := m[another]; ok {
			// 存在 就返回 返回 2 个数字在数组中的下标
			return []int{m[another], i}
		}
		// 不存在 添加到map key val ：数字：index
		m[nums[i]] = i
	}
	return nil
}

// @lc code=end
