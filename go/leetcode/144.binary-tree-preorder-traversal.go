/*
 * @lc app=leetcode id=144 lang=golang
 *
 * [144] Binary Tree Preorder Traversal
 */
package leetcode

// @lc code=start

// 非递归，用栈模拟递归过程
func preorderTraversal(root *TreeNode) []int {
	if root == nil {
		return []int{}
	}

	stack, res := []*TreeNode{}, []int{}

	stack = append(stack, root)
	for len(stack) != 0 {
		// 栈顶元素
		node := stack[len(stack)-1]
		// 出栈
		stack = stack[:len(stack)-1]

		if node != nil {
			res = append(res, node.Val)
		}

		if node.Right != nil {
			stack = append(stack, node.Right)
		}
		if node.Left != nil {
			stack = append(stack, node.Left)
		}
	}
	return res
}

// 递归过程  分而治之

func preorderTraversal1(root *TreeNode) []int {
	// 答案
	res := []int{}
	if root != nil {
		// 加入跟节点
		res = append(res, root.Val)
		// 遍历左节点
		tmp := preorderTraversal1(root.Left)
		// 把左节点的答案加入res
		// for _, t := range tmp {
		// 	res = append(res, t)
		// }
		res = append(res, tmp...)
		// 遍历右节点，同样加入res
		tmp = preorderTraversal1(root.Right)
		// for _, t := range tmp {
		// 	res = append(res, t)
		// }
		res = append(res, tmp...)
	}
	return res
}

// 递归

func preorderTraversal2(root *TreeNode) []int {
	// 答案
	var res []int
	preorder(root, &res)
	return res
}

func preorder(root *TreeNode, res *[]int) {
	if root != nil {
		*res = append(*res, root.Val)
		preorder(root.Left, res)
		preorder(root.Right, res)
	}
}

// @lc code=end
