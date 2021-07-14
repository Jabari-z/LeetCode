/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */
class Solution7 {
// @lc code=start
// class Solution {
    public int reverse(int x) {
        //  0
        if (x==0) {
            return 0;
        }
        // 处理正负数
        int sign = x>0?1:-1;
        // 处理10的倍数
        int xval = Math.abs(x);

        return sign*helper(xval);
    }
    private int helper(int x){
        // 进来的是无符号数
        if (x%10==0){ // 处理末尾的0
            helper(x/10);
        }
        long val = 0; // 不能用int  溢出
        while(x>0){
            val = val*10 + x%10;
            x = x/10;
        }
        // 检查合法
        if (val < Integer.MIN_VALUE || 
            val > Integer.MAX_VALUE) 
            val = 0;
        return (int)val;

    }
}
// @lc code=end

/**
 *  Wrong Answer
    1028/1032 cases passed (N/A)
    Testcase
    1534236469
    Answer
    1056389759
    Expected Answer
    0
 */
