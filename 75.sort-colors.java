import java.util.*;

/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */
class Solution75 {
// @lc code=start
// class Solution {
    public void sortColors_(int[] nums) {
        Arrays.sort(nums);
    }
    public void sortColors(int[] nums) {
        //               i  l  r
        /// 2 0 2 1 1 1  0  0  5
        //  1 0 2 1 1 2  0  0  4
        //  1 0 2 1 1 2  1  0  4
        //  0 1 2 1 1 2  2  1  4
        //  0 1 1 1 2 2  2  1  3
        // 遍历 ： 入遇到2 和最后的呼唤
        //        遇到0   和最前面的互换
        int l = 0;
        int r = nums.length -1 ;
        int i = 0;
        while(i<=r){/// 这里是 i i < r 刚好遍历一次
            if(nums[i]==0){
                swap(nums,i,l);
                i++;
                l++;
            }else if(nums[i]==2){
                swap(nums,i,r);
                r--;
            }else{
                i++;
            }
        }
    }
    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
// @lc code=end

