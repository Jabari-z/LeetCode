/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */
class Solution21 {
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 合并链表移动节点
        ListNode merge = new ListNode(-1);
        // 答案节点
        ListNode res = merge; 
        // 比较大小
        while(l1!=null &&l2!=null){
            if(l1.val<=l2.val){
                merge.next = l1;
                l1 = l1.next;
            }else{
                merge.next = l2;
                l2 = l2.next;
            }
            merge = merge.next;
        }
        // 下边两个if只会执行一个
        if(l1!=null){
            merge.next = l1;
        }
        if(l2!=null){
            merge.next = l2;
        }
        return res.next;
    }
}
// @lc code=end

