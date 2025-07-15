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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode second=head;
        int n=findlength(head);
        for(int i=1;i<k;i++)
        {
            first=first.next;
        }
        for(int i=1;i<n-k+1;i++)
        {
            second=second.next;
        }
       int temp=first.val;
       first.val=second.val;
       second.val=temp;
       return head;

    }
    public static int findlength(ListNode ans)
    {
        int cnt=0;
        while(ans!=null)
        {
            cnt++;
            ans=ans.next;
        }
        return cnt;
    }
}