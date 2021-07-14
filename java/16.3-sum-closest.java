import java.util.*;
/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */
class Solution16 {
// @lc code=start
// class Solution {
    public int threeSumClosest(int[] nums, int target) {
         // 排序
         Arrays.sort(nums);
         // 假设 012 三个数字 是cloestnum
         int closestNum = nums[0] + nums[1] + nums[2];
         for (int i = 0; i < nums.length - 2; i++) {
             int l = i + 1, r = nums.length - 1;
             while (l < r){
                 // 三数之和
                 int threeSum = nums[l] + nums[r] + nums[i];
                 // 小于是cloestnum更新  绝对值
                 if (Math.abs(threeSum - target) < Math.abs(closestNum - target)) {
                     closestNum = threeSum;
                 }
                 if (threeSum > target) {
                     r--;
                 } else if (threeSum < target) {
                     l++;
                 } else {
                     // 如果已经等于target的话, 肯定是最接近的
                     return target;
                 }
             }
         }
 
         return closestNum;
    }
}
// @lc code=end

