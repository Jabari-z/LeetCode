import java.util.*;
/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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

// class Solution {
class Solution94 {
    //递归方法
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal_(TreeNode root) {
        if(root==null)
            return res;
        // 中序
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;
    }
    //非递归
    public List<Integer> inorderTraversal1(TreeNode root) {
        if(root==null)
            return res;
        /**
         *        1
         *    2       3
         * 4    5        6
         * 
         * 有左节点就放入栈中
         * 栈 3  
         * 出 4 2 5 1
         *
         */
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        while(!stack.empty()){
            if(p!=null&&p.left!=null){
                // 只要有左节点就放入栈中
                stack.push(p.left);
                p = p.left;
            }else{
                // 出 栈
                p = stack.pop();
                res.add(p.val); // 输出
                // 有右节点 入栈
                if(p!=null&&p.right!=null){
                    stack.push(p.right);
                    p = p.right;
                }else{
                    ///////////这里
                    p = null;
                }
            }

        }
        return res;
    }


    // 非递归2
    // 这个版本好理解
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return res;
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        while(p!=null||!stack.empty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            if(!stack.empty()){
                p = stack.pop();
                res.add(p.val);
                p = p.right;
            }
        }
        return res;
    }

}
// @lc code=end

