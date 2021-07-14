/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */
class Solution206 {

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// @lc code=start
// class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode nxt;
        while(cur!=null){
            nxt = cur.next;
            cur.next = pre;

            pre = cur;
            cur = nxt;
        }
        head.next = null;
        return pre;
    }
}
// @lc code=end

