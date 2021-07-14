package leetcode

/*
 * @lc app=leetcode id=2 lang=golang
 *
 * [2] Add Two Numbers
 */

// @lc code=start

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	// 答案的头节点
	head := &ListNode{Val: 0}
	n1, n2, carry, current := 0, 0, 0, head
	// 循环 l1 / l2 最长的次数
	for l1 != nil || l2 != nil || carry != 0 {
		// 如果l1为空了  加数置 0
		if l1 == nil {
			n1 = 0
		} else {
			n1 = l1.Val
			l1 = l1.Next
		}
		// 如果l2为空了  加数置 0
		if l2 == nil {
			n2 = 0
		} else {
			n2 = l2.Val
			l2 = l2.Next
		}
		// 答案的保存
		current.Next = &ListNode{Val: (n1 + n2 + carry) % 10}
		// 下一位
		current = current.Next
		// 进位
		carry = (n1 + n2 + carry) / 10
	}
	return head.Next
}

// @lc code=end
