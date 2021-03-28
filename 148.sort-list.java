/*
 * @lc app=leetcode id=148 lang=java
 *
 * [148] Sort List
 */
class Solution148 {
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
    public ListNode sortList(ListNode head) {
        //递归 //
        if(head==null||head.next==null)
            return head;
        //
        ListNode p1 = head;
        ListNode p2 = head.next;
        // p2 走两步 p1 走一步  
        // 快慢指针 找到中点 一分为二
        while(p2!=null){ // 快节点
            p2 = p2.next;
            if(p2==null){
                break;
            }
            p2 = p2.next;
            p1 = p1.next;
        }

        p2 = p1.next;
        p1.next = null;
        p1 = head;
        // 递归处理两部分
        p1 = sortList(p1);
        p2 = sortList(p2);
        // 合并
        return mergeList(p1,p2);
    }
    private ListNode mergeList(ListNode left,ListNode right){
        if(left==null) return right;
        if(right==null) return left;
        if(left.val<=right.val){
            left.next = mergeList(left.next, right);
            return left;
        }else{
            right.next = mergeList(right.next, left);
            return right;
        }
    }
}
// @lc code=end

