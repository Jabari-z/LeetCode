
/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 *   两数相除
 * 不使用 除法 乘法 mod
 */

// @lc code=start
//class Solution {
class Solution29 {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 || 
            (dividend == Integer.MIN_VALUE && divisor == -1)){//考虑特殊情况
            return Integer.MAX_VALUE;
        }
        // if (divisor==1) {
        //     return dividend;
        // }
        int res = 0;
        int sign = ((dividend<0)^(divisor<0))?-1:1;
        long ms = (long)dividend;
        long ns = (long)divisor;
        ms = Math.abs(ms);// 被除数
        ns = Math.abs(ns);// 除数
        while(ms>=ns){// 被除数 要比 除数大
            long m = ns;    // 除数
            long n = 1;     // 一个轮次的结果
            while(ms>=(m<<1)){ // 除数 扩大两倍 左移
                m<<=1;
                n<<=1;
            }
            res+=n;
            ms-=m;
        }
        return sign*res;
    }
}
// @lc code=end

