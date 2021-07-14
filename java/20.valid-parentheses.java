import java.util.*;
/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */
class Solution20 {
// @lc code=start
// class Solution {
    // 匹配括号是否有效
    // 栈 -> isEmpty()
    private HashMap<Character, Character> mappings;
    public Solution20() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }
    public boolean isValid1(String s) {
        if (s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}') {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.mappings.containsKey(c)) {
                char topEl = stack.empty()?'#':stack.pop();
                if(topEl!=this.mappings.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
            //                            这里出栈了
                return false;
        }
        return stack.isEmpty();
    }
}
// @lc code=end

