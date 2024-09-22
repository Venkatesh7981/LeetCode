/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.HashMap;
public class Solution {
    public boolean hasCycle(ListNode head) {
        //  ListNode slow=head;
        //   ListNode fast=head;
        //  while(fast !=null && fast.next!=null){
        //        fast=fast.next.next;
        //        slow=slow.next;
        //        if(fast==slow){
        //         return true;
        //        }
        //  }
        //  return false;
        HashMap<ListNode,Integer> nodemap=new HashMap<>();
        ListNode temp=head;
        while(temp!=null) {
            if(nodemap.containsKey(temp)) return true;
            else{
                nodemap.put(temp,1);
                temp=temp.next;
            }
        }
        return false;
    }
}