/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution61 {
// class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // 特殊处理
        if(head==null||head.next==null||k==0) return head;
        ListNode dummyHead = new ListNode(-1);
        ListNode p = head,q=head,r=head;
        int len = 0;
        // 链表长度
        while(r!=null){
            r = r.next;
            len++;
        }
        // k = k%len;     4 % 3  = 1
        //             
        k = (len + (k % len)) % len;//
        if(k==len||k%len==0){
            return head;
        }
        for (int i = 0; i < k; i++) {
            p = p.next; // 先前移动 k
        }

        while(p.next!=null){
            p = p.next;  // p指向尾节点
            q = q.next;
        }
        dummyHead = q.next;
        p.next = head;
        q.next = null; // q节点编程尾节点了
        return dummyHead;

    }
}
// @lc code=end

