import javax.print.event.PrintEvent;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode p = head;
        int len = 0;
        while(p!=null){
            len++;
            p = p.next;
        }
        int[] res = new int[len];

        p = head;
        while(p!=null){
            res[(len-1)] = p.val;
            len--;
            p = p.next;
        }
        return res;
    }
}