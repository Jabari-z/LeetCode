/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

class Solution23 {
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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        // 两两 合并
        ListNode  merge = null;
        for (int i = 0; i < n; i++) {
            merge = mergeTwoLists(merge, lists[i]);
        }
        return merge;
    }
}
// @lc code=end

