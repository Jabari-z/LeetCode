/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 * 
 * Follow up: Could you solve it 
 * without converting the integer to a string?
 * 
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        int orix = x;
        int revx = 0;
        // 倒序数字
        while(x>0){
            revx = revx*10+x%10;
            x /= 10;
        }
        // 是否和原值一样
        return orix==revx;
    }
}
// @lc code=end

/**
 * 121
 * x = 121
 *    revx = 0 + 1  = 1
 *    x = 12
 * x = 12
 *     revx = 12
 *      x = 1
 * x = 1
 *      revx = 121
 *      x = 1/10 = 0
 */