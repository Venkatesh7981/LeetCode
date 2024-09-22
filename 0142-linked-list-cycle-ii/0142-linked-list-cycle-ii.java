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
    public ListNode detectCycle(ListNode head) {
    //     ListNode temp=head;
    //     HashMap<ListNode,Integer> nodemap=new HashMap<>();
    //     while(temp!=null){
    //         if(nodemap.containsKey(temp)) return temp;
    //         else{
    //             nodemap.put(temp,1);
    //             temp=temp.next;
    //         }
    //     }
    //  return null;
     ListNode slow=head;
     ListNode fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       
    if(slow==fast){
         slow=head;
      while(slow!=fast){
        slow=slow.next;
        fast=fast.next;
      }
      return slow;
    }
    }
    return null;
    
    }
}