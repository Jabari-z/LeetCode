/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p = head;
        if(head.val == val) return head.next;
        while(p.next!=null){
            if(p.next.val==val){
                p.next = p.next.next;
                return head;
            }
            p = p.next;
        }
        return head;
    }
    /**
     * C++如果给一个 要删除的节点（注意 是节点 不是节点值）
     * 让要删除的节点 = next节点的值
     * next节点指向next.next
     */

    public ListNode deleteNode_(ListNode head, ListNode deleteNode) {
        // 要删除的节点不是尾节点
        if(deleteNode.next!=null){
            ListNode p = deleteNode.next;
            deleteNode.val = p.val;
            deleteNode.next = p.next;
            return head;
        }
        // 链表只有一个节点
        else if(head==deleteNode){
            return null;
        }
        //要删除的是尾节点
        else{
            ListNode p = head;
            while(p.next!=deleteNode){
                p = p.next;
            }
            p.next = null;
        }
    }
}