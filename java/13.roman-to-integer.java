import java.util.*;
/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */
class Solution13 {
// @lc code=start
// class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return map.get(s);
        }
        int res = 0;
        int n = s.length();
        for(int i = 0;i<n;i++){
            // 最后一个字符 不进行 2步 试探
            // 先寻找两个字母 对应的数字
            if(i!=n-1 && map.containsKey(s.substring(i,i+2))){
                res+=map.get(s.substring(i,i+2));
                i++;
            }else if(map.containsKey(s.substring(i,i+1))){
                // 进行一个字符的对应数字
                res+=map.get(s.substring(i,i+1));
            }else{
                // 其他字符  不管
            }
        }
        
        return res;
    }
}
// @lc code=end

