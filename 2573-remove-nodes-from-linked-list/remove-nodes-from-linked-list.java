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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> li=new ArrayList<>();
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(temp!=null)
        {
            li.add(temp.val);
            temp=temp.next;
        }
        int max=Integer.MIN_VALUE;
        for(int i=li.size()-1;i>=0;i--)
        {
           if(li.get(i)>=max)
           {
            ListNode newnode=new ListNode(li.get(i));
            curr.next=newnode;
            curr=newnode;
           }
           max=Math.max(max,li.get(i));
        }
        return reverse(dummy.next);
    }
    public static ListNode reverse(ListNode ans)
    {
        ListNode temp=ans;
        ListNode prev=null;
        while(temp!=null)
        {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}