/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
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






class Solution98 {
// class Solution {
    public boolean isValidBST(TreeNode root) {
        //判断是否为有效的二叉查找树
        // 二叉查找树的性质‘       左子树 < 跟 < 右子树
        return nodeCheck(root,null,null);
    }
    public boolean nodeCheck(TreeNode root,Integer low,Integer high){
        // root 为空
        if (root==null) {
            return true;
        }
        Integer rootval = root.val;
        if(low!=null&&low>=rootval) return false;
        if(high!=null&&high<=rootval) return false;
        return nodeCheck(root.left, low, rootval)&&
                nodeCheck(root.right, rootval, high);

    }
}
// @lc code=end

