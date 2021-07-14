/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {

        // 双指针
        int l = 0;
        int r = nums.length-1;
        int mid = 0;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid]==nums[l] && nums[mid]==nums[r]){
                l = l+1;
            }else if(nums[mid]>nums[r]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return nums[mid];
    }
}
// @lc code=end

