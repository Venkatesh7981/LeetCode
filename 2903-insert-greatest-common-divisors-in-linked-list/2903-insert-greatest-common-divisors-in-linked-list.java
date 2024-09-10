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
     public static int gcd(int a, int b){
            if(a==0){
                return b;
            }
            return gcd(b%a,a);
        }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       int prev=head.val;
       ListNode temp=head;
       while(temp.next!=null){
        int cur=temp.next.val;
        ListNode node=new ListNode(gcd(cur,prev));
        node.next=temp.next;
        temp.next=node;
        prev=cur;
        temp=temp.next;
        temp=temp.next;
       }
        return head;
    }
}