package DailyChallenge.April.week1;

import java.util.List;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    /**
     * 判断一个链表是不是回文
     * @param head 链表头
     * @return 
     */
    public boolean isPalindrome(ListNode head) {
        //1.求链表长度
        //2.反转链表 一部分链表
        //3.比较
        int len = 0;
        ListNode p = head;
        ListNode p1 = head;
        ListNode p2 = null;

        //   链表长度
        while(p!=null){
            ++len;
            p = p.next;
        }

        System.out.println("len:"+len);

        //计算后一部分的起点
        int half = 0;
        if(len%2==0){
            half = len/2;
        }else{
            half = len/2+1;
        }
        p = head;
        // 找到后一部分的开头
        for (int i = 0; i < half; i++) {
            p = p.next;
        }
        // System.out.print(p.val);
        // System.out.print(p.next.val);
        //反转 后边的链表

        p2 = reverseList(p);
      
        //比较
        while(p2!=null){
            if(p1.val==p2.val){
                p1 = p1.next;
                p2 = p2.next;
            }else{
                return false;
            }
        }

        return true;
    }

    private ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode tmp;
        while(cur!=null){
            tmp = cur.next;
            cur.next = pre;

            pre = cur;
            cur = tmp;
        }
        head.next = null;
        return pre;
    }
}
public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        // ListNode l4 = new ListNode(1);

        l1.next = l2;
        l2.next = l3;
        // l3.next = l4;

        // while(l1!=null){
        //     System.out.println(l1.val);
        //     l1 = l1.next;
        // }
        System.out.println(new Solution().isPalindrome(l1));
        

    }
}
