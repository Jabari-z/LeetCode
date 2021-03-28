import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */
class Solution3 {
// @lc code=start
// class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        // 一次遍历
        for (int i = 0,j=0; j < s.length(); j++) {
            // i 头  j 尾
            if(map.containsKey(s.charAt(j))){
                //更新头位置
                i = Math.max(map.get(s.charAt(j)), i);
            }
            max = Math.max(max, j-i+1); // 不断更新
            map.put(s.charAt(j), j+1);
        }
        return max;
    }
}
// @lc code=end

