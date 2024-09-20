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
    public ListNode removeElements(ListNode head, int val) {
     if(head==null) return head;
        ListNode ans=new ListNode(0);
         ListNode cur=ans;
        ans.next=head;
       
        while(cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }
            else cur=cur.next;
        }
        return ans.next;
    }
}