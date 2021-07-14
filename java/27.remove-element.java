/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        // 双指针 l r 
        // l 遇到删除的 就和r 互换 
        // r 遇到要删除的 就--
        // 3 2 2 3
        // l     r
        //     r
        // 2 2 3 3
        // l l l  这时候 l = r 了
        // if(nums.length==1 && nums[0]==val) return 0;

        // int l = 0;
        // int r = nums.length-1;
        // // int n = nums.length;
        // while(l<r){
        //     while(l<r&&nums[r]==val) --r; // 如果等于要删除的值 不用管 直接-- 找到不删除的数字
        //     while(l<r&&nums[l]!=val) ++l;
        //     if(nums[l]==val&&nums[r]!=val){
        //         int tmp = nums[l];
        //         nums[l] = nums[r];
        //         nums[r] = tmp;

        //         // nums[l] = val;
        //     }
            
        // }
        //// 111111
        // int j = nums.length-1;
        // for(int i = 0;i<=j;i++){
        //     if(nums[i]==val){
        //         swap(nums, i--, j--);
        //     }
        // }
        // return j+1;
        ///////22222
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
    void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
// @lc code=end

