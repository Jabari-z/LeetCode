import java.util.Stack;

/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

// @lc code=start
class Solution {
    public int longestValidParentheses(String s) {
        if(s.length()==0 || s == null){
            return 0;
        }
        // 使用栈
        int start = 0;
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if('('==s.charAt(i)){ // 遇到左括号
                stack.push(i);  // 入栈
            }else{    //右括号
                if(stack.isEmpty()){ // 栈空  “ ）（（”
                    start = i+1; // 更新start
                    continue;
                }else{
                    stack.pop(); // 可以匹配
                    if(stack.isEmpty()){
                        max = Math.max(max, i-start+1);
                    }else{
                        max = Math.max(max, i-stack.peek());
                    }
                }
            }
        }
        return max;
    }
    

}
// @lc code=end

