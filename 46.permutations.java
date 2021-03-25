/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 * 排列
 */


import java.util.*;
// @lc code=start
 class Solution46 {
//class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        // List<Integer> oneres = new ArrayList<>();
        helper(0, nums, res);

        return res;
    }
    public void helper(int index,int[] nums,List<List<Integer>> res){
        if (index==nums.length) {
            List<Integer> oneres = new ArrayList<>();
            for (int k : nums) {   
                oneres.add(k); 
            }
            res.add(new ArrayList<>(oneres));
        }
        /**
         * index = 0
         * swap (0,0) 固定第一个数
         * helper（1，nums，res）
         *           
         */
        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            helper(index+1, nums, res);
            swap(nums, i, index);
        }
    }
    public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // public static void main(String[] args) {
    //     int [] nums = new int[]{1,2,3};
    //     new Solution46().permute(nums);
    // }
}
// @lc code=end

