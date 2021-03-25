/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0])
            return 0;
        if(target>nums[nums.length-1])
            return nums.length;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<=nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
// @lc code=end

