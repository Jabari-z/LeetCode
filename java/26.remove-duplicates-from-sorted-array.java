/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        // 那么第一个元素 和 追后一个元素 一定是 最小元素 和最大元素
        
        int index = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[index]){
                continue;
            }else{
                nums[++index] = nums[i];
                
            }
        }

        return index+1; //+1 ：  index和len差1
    }
}
// @lc code=end

