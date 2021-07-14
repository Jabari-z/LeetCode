package leetcode

/*
 * @lc app=leetcode id=206 lang=golang
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reverseList(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}

	var pre *ListNode
	cur := head
	for cur != nil {
		// cur.Next, pre, cur = pre, cur, cur.Next
		pre, cur, cur.Next = cur, cur.Next, pre
	}
	return pre

}

// @lc code=end
