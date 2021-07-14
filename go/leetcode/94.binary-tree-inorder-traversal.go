/*
 * @lc app=leetcode id=94 lang=golang
 *
 * [94] Binary Tree Inorder Traversal
 */
package leetcode

// @lc code=start

func inorderTraversal(root *TreeNode) []int {
	var output []int
	inorder(root, &output)
	return output
}

func inorder(root *TreeNode, output *[]int) {
	if root != nil {
		inorder(root.Left, output)
		*output = append(*output, root.Val)
		inorder(root.Right, output)
	}
}

// @lc code=end
