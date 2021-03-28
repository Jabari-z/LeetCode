/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */
class Solution12 {
// @lc code=start
// class Solution {
    public String intToRoman(int num) {
        // I 1
        // IV 4
        // V 5
        // IX 9
        // X 10
        // XL 40
        // L 50
        // XC 90
        // C 100
        // CD 400
        // D 500
        // CM 900
        // M 1000
        String res = "";
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String reps[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        //
        for (int i = 0; i < reps.length; i++) {
            while(num>=values[i]){
                num-=values[i];
                res+=reps[i];
            }
        }
        return res;
    }
}
// @lc code=end

