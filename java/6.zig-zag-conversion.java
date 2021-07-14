

/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] ZigZag Conversion
 */

// @lc code=start
class Solution6 {
// class Solution {
    public String convert(String s, int numRows) {
       int length = s.length();
       if (length==0 || length<=numRows || numRows==1) {
           // 特殊情况 单独处理
           return s;
       } 
       int gap = numRows-2; // 斜的列树
       String res = "";
       int k1 = numRows - 1 + gap + 1;
       for (int i = 0; i < numRows; i++) {
           int location = 0;
           // 第一行 和 最后一行
           if(i==0||i==numRows-1){
               res = res + s.charAt(i);
               location =i+ k1; // 坐标间隔k1个
               while(location<length){
                   res=res+s.charAt(location);
                   location = location+k1;
               }

           }else{// 中间行
                res=res+s.charAt(i);
                int k2 = k1-i*2;
                location = location+k2+i;
                while(location<length){
                    res=res+s.charAt(location);
                    k2 = k1-k2;
                    location = k2+location;
                }
           }
       }
       return res;
    }
}
// @lc code=end

