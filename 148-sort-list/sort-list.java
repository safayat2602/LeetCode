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
    public ListNode sortList(ListNode head) {
     return mergesort(head);
    }
    public ListNode mergesort(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode middle=findmiddle(head);
        ListNode righthead=middle.next;
        middle.next=null;
         ListNode lefthead=head;
        lefthead=mergesort(lefthead);
        righthead=mergesort(righthead);
        return merge(lefthead,righthead);
    }
    public ListNode merge(ListNode h1,ListNode h2)
    {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(h1!=null && h2!=null)
        {
          if(h1.val<h2.val)
          {
            temp.next=h1;
            temp=h1;
            h1=h1.next;
          }
          else{
            temp.next=h2;
            temp=h2;
            h2=h2.next;
          }
        }
        if(h1!=null)
        {
            temp.next=h1;
        }
        else{
            temp.next=h2;
        }
        return dummy.next;
    }
    public ListNode findmiddle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}