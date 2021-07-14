import java.util.*;

/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start

// Definition for a binary tree node.
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
class Solution102 {
// class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 层次遍历
        // 需要队列
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        //跟节点入栈
        queue.offer(root);
        //当前层 只有跟节点
        int curLevel = 1;
        int nextLevel = 0;
        TreeNode node;
        // 队列不为空
        while (!queue.isEmpty()) {
            List<Integer> levelRes = new LinkedList<>();
            // 当前层
            while(curLevel-- >0){
                //出队列
                node = queue.poll();
                levelRes.add(node.val);
                // 把左右节点加入队列
                if(node.left!=null){
                    queue.offer(node.left);
                    ++nextLevel;// 下一层+1
                }
                if (node.right!=null) {
                    queue.offer(node.right);
                    ++nextLevel;// 下一层+1
                }
            }
            res.add(levelRes);
            curLevel = nextLevel;
            nextLevel = 0;
        }
        return res;
    }
}
// @lc code=end

