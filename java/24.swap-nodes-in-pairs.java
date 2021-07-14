/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 */
class Solution24 {


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
    public ListNode swapPairs(ListNode head) {
        if(head ==null||head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;

        while(pre.next!=null && pre.next.next!=null){
            ListNode cur = pre.next;
            ListNode nxt = pre.next.next;
            cur.next = nxt.next;
            nxt.next = cur;
            pre.next = nxt;

            pre = pre.next.next;
        }

        return dummy.next;

    }
}
// @lc code=end

