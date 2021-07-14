package others;

/**
 * 把给定一棵树 去掉一些节点 变为 完美二叉树
 */
public class Main1 {
    public TreeNode solve(TreeNode root){
        if(root==null) return root;
        if (root.left==null&&root.right==null) {
            return root;
        }
        if (root.left==null||root.right==null) {
            if (root.left==null) {
                root.right=null;
                return root;
            }
            if (root.right==null) {
                root.left=null;
                return root;
            }
        }
        root.left = solve(root.left);
        root.right = solve(root.right);
        return root;
    }
}
