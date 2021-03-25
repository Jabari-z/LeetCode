/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */




// @lc code=start
class Solution33 {
// class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            // 旋转点在中位数右侧
            if (nums[mid]>=nums[start]) {
                if(nums[mid]>target && nums[start]<=target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[end]){
                    start = mid + 1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    // public static void main(String[] args) {
    //     int[] nums = new int[]{4,5,6,7,0,1,2};
    //     System.out.println(new Solution().search(nums, 0));
    // }
}
// @lc code=end

