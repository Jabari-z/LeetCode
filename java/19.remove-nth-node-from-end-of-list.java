
/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */
class Solution19 {
// @lc code=start

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// class Solution {
    //  删除倒数第n个节点
    public ListNode removeNthFromEnd_(ListNode head, int n) {
        if (head == null){
            return null;
        }
        // 只有一个节点的时候
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        while(n>0){
            if(p.next!=null)
                p=p.next;
            n = n-1;
        }
        ListNode q = dummy;
        while(p.next!=null){
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;

        return dummy.next;
    }
    // 方法二
    // 1.求链表长度
    // 2.计算要删除的元素位置
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode cur = head;
        ListNode pre = cur;
        int listSize = getSize(head);
        int index = listSize-n+1;
        while(index-->0){
            pre = cur;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return head;

    }
    private int getSize(ListNode head){
        ListNode cur = head;
        int size = 0;
        if(head==null){
            return size;
        }
        while(cur.next!=null){
            size++;
            cur = cur.next;
        }
        return size;
    }
}
// @lc code=end

