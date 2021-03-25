/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start

// // Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution2 {
// class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        //
        ListNode res = new ListNode(-1);
        ListNode p = res;
        int c = 0;
        int r = 0;
        int sum;
        while(l1!=null && l2!=null){
            sum = l1.val+l2.val+c;
            c = sum/10; // 进位
            r = sum%10; // 本位
            p.next = new ListNode(r);

            l1 = l1.next;
            l2 = l2.next;
            p =  p.next;
        }
        while(l1!=null){
            sum = c+l1.val;
            p.next = new ListNode(sum%10);
            c = sum/10;
            l1 = l1.next;
            p = p.next;
        }
        while(l2!=null){
            sum = c+l2.val;
            p.next = new ListNode(sum%10);
            c = sum/10;
            l2 = l2.next;
            p = p.next;
        }
        //最后再处理c 进位
        if(c!=0){
            p.next = new ListNode(c%10);
        }

        return res.next;
    }
}
// @lc code=end

