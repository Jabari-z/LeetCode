/*
 * @lc app=leetcode id=234 lang=golang
 *
 * [234] Palindrome Linked List
 */
package leetcode

// @lc code=start

//lint:file-ignore U1000 Ignore all unused code, it's generated
func isPalindrome(head *ListNode) bool {
	// 反转后一半的链表 ： 1.找到后半部分 2. 反转
	// 找到后半部分 ：
	//  1. 计算链表长度 取half
	//  2. 快慢指针

	if head == nil || head.Next == nil {
		return true
	}
	first := head
	second := findmidMid(first)
	// 反转链表后半部分  1->2->3->4->5->6 to 1->2->3->6->5->4
	p2 := revs(second)
	p1 := head

	// 	比较
	for p2 != nil {
		if p1.Val == p2.Val {
			p1 = p1.Next
			p2 = p2.Next
		} else {
			return false
		}
	}
	return true
}

// 找到中点
func findmidMid(head *ListNode) *ListNode {
	p1 := head
	p2 := head
	n := 0
	mid := 0
	for p1 != nil {
		n++
		p1 = p1.Next
	}
	if n%2 == 0 {
		mid = n / 2
	} else {
		mid = n/2 + 1
	}

	for i := 0; i < mid; i++ {
		p2 = p2.Next
	}
	return p2

	// 快慢指针
	// p1 := head
	// p2 := head

	// for p2.Next != nil && p2.Next.Next != nil {
	// 	p1 = p1.Next
	// 	p2 = p2.Next.Next
	// }
	// return p1
}

// 反转链表
func revs(head *ListNode) *ListNode {
	pre := head
	cur := head.Next
	for cur != nil {
		tmp := cur.Next
		cur.Next = pre

		pre = cur
		cur = tmp
	}
	head.Next = nil
	return pre
}

// @lc code=end
