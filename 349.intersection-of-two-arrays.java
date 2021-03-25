import java.util.*;
/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution349 {
// class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();
        List<Integer> res = new ArrayList<>();
        for(int num: nums1){
            set.add(num);
        }
        for (int num : nums2) {
            if(set.contains(num)){
                res.add(num);
                set.remove(num);
            }
        }
        int[] resarray = new int[res.size()];
        for (int i = 0; i < resarray.length; i++) {
            resarray[i] = res.get(i);
        }
        return resarray;
    }
}
// @lc code=end

