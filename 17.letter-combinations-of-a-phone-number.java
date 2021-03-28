import java.util.*;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */
class Solution17 {
// @lc code=start
// class Solution {
    //方法1
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length()==0){
            return Collections.emptyList();
        }
        List<String> res = new ArrayList<>();
        backtrack(digits,0,"",res);
        return res;
    }
    // 
    private void backtrack(String digits,int start,String letters,List<String> res){
        if(start==digits.length()){
            res.add(letters);
            return;
        }
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3', "def");
        map.put('4',"ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        String current = map.get(digits.charAt(start));
        for (char c : current.toCharArray()) {
            backtrack(digits, start+1, letters+c, res);
        }

    }
    // 方法2  
    public List<String> letterCombinations_(String digits){
        if(digits==null||digits.length()==0){
            return Collections.emptyList();
        }
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3', "def");
        map.put('4',"ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        final List<String> combs = new LinkedList<>();
        combs.add("");
        for (char c : digits.toCharArray()) {//   遍历 digits 得到一位数字
            char[] letters = map.get(c).toCharArray(); // digit对应的字母表
            for (int i = combs.size(); i >0 ; i--) { // comb中已有的string 进行 +
                String s = combs.remove(0);
                for (char l : letters) {
                    combs.add(s+l);
                }
            }
        }
        return combs;
    }
}
// @lc code=end

