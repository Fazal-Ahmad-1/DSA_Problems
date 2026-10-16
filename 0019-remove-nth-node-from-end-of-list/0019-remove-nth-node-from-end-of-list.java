/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l=0;
        ListNode p=head;
        while(p!=null)
        {
            l++;
            p=p.next;
        }
        if(l==n)
        {
            head=head.next;
            return head;
        }

        int r=l-n+1;
        p=head;
        ListNode q=null;
        for(int i=1;i<r;i++)
        {
            q=p;
            p=p.next;
        } 
        q.next=p.next;
        return head;

    }
}