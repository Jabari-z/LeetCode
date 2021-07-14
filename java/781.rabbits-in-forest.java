import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

/*
 * @lc app=leetcode id=781 lang=java
 *
 * [781] Rabbits in Forest
 */

// @lc code=start
class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> count = new HashMap<>();
        for (int i : answers) {
            count.put(i, count.getOrDefault(i, 0)+1);
        }
        int res = 0;
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            int i = entry.getKey(),x = entry.getValue();
            res+=(x+i)/(i+1)*(i+1);
        }
        return res;
    }
   
}
// @lc code=end

