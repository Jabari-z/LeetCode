import java.util.*;
/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        /**方案 双指针
         * 1. 先排序
         * 2. 定1 Two sum 双指针 收缩
         * 3. a为 定1 
         *    -a 与 nums[i]+nums[j]比较
         * -4 -1 -1 0 1 2
         *  a
         *     i        j
         *   > -a=4  nums[i]+nums[j]=1      > 
         *        -a > nums[i]+nums[j]     i++
         *        i     j
         *           i  j 
         *            i j                             
         **/

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length-2; k++) {
            int a = nums[k];
            int i = k+1;
            int j = nums.length-1;
            while(i<j){
                int two = nums[i]+nums[j];
                if(-a == two) {
                    res.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    //当前元素与下一个元素不同 才进行移动
                    while (i < j && nums[i] == nums[i+1]) i++;
                    while (i < j && nums[j] == nums[j-1]) j--;
                    i++;j--;
                }

                else if(-a>two) i++;
                else j--;
            }
        }
        return res;


    }
}
// @lc code=end

