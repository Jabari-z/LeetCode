/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */
class Solution11 {
// @lc code=start
// class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        // l r 向 内 收 缩 
        while(l<=r){
            // 计算最大面试
            // 最小的 l r 最小的高度 x lr距离 
            max = Math.max(max, Math.min(height[l],height[r])*(r-l));
            // 向变小的方向收缩
            if (height[l]<height[r]) {
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
// @lc code=end

