/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */
// public class Solution190 {
// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //32位
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            // N&1=1  表示N的二进制 最右边一位 为1
            rev |= (n&1)<<(31-i);
            n>>>=1; //逻辑右移  /2
        }
        return rev;
    }
}
// @lc code=end

