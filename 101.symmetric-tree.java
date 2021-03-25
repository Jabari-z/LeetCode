/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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

class Solution {
    public boolean isSymmetric(TreeNode root) {
        // 对称的树
        // 左子树 = 右子树
        if(root == null) return true;
        return isSymmetricTree(root.left,root.right);

    }
    public boolean isSymmetricTree(TreeNode left, TreeNode right) {
        // 两个指针都为空
        if(left==null&&right==null){
            return true;
        }
        // 其中一个为空
        if(left==null||right==null){
            return false;
        }

        //两个节点的值 相同 后
        // 递归 检查 左子树 和 右子树
        if(left.val == right.val)
            return isSymmetricTree(left.left,right.right)&&isSymmetricTree(left.right, right.left);        
        return false;    
    }
}
// @lc code=end

