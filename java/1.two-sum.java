import java.util.HashMap;
/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution1 {
    // 暴力遍历
    public int[] twoSum_1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i]+nums[j]) {
                    return new int[]{i,j};
                }
                
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    // HashMap
    public int[] twoSum(int[]nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
                    // 数   index
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int computed = target-nums[i];
            if(map.containsKey(computed) && map.get(computed)!=i){
                return new int[]{i,map.get(computed)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        System.out.println(new Solution1().twoSum_1(new int[]{1,2,3,3,4,5,6}, 6)[1]);
    }
}
// @lc code=end

