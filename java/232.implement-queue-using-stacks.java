import java.util.Stack;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;
    /** Initialize your data structure here. */
    public MyQueue() {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        move();
        return s2.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        move();
        return s2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(s1.empty()&&s2.empty()){
            return true;
        }
        return false;
    }

    // 把s1的移动到说
    private void move(){
        if(s2.isEmpty()){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

