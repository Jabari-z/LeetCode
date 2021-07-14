/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

// @lc code=start
class Solution81 {
// class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length==0)
            return false;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start +( end - start)/2;
            if (nums[mid]==target) {
                return true;
            }
            // [1,0,1,1] 这种情况
            if (nums[start] == nums[mid]) {
                start = start + 1;
                continue;
            }

            if (nums[start]<nums[mid]) {
                // 旋转点在右侧
                if(nums[start]<=target && target <nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                // 旋转点在左侧
                if(nums[mid]<target && target <= nums[end]){
                    start = mid +1;
                }else{
                    end = mid-1;
                }
            }
        }

        return false;
    }
}
// @lc code=end

