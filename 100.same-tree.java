/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution100 {
// class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p==null&&q!=null)||
           (q==null&&p!=null)){
            return false;
        }
        if(p==null&&q==null){
            return true;
        }
        //递归
        if(p.val == q.val)
            return isSameTree(p.left,q.left)&&isSameTree(p.right, q.right);        
        return false;    
    }
}
// @lc code=end

