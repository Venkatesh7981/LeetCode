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
        ListNode temp=head;
        HashMap<ListNode,Integer> nodemap=new HashMap<>();
        while(temp!=null){
            if(nodemap.containsKey(temp)) return temp;
            else{
                nodemap.put(temp,1);
                temp=temp.next;
            }
        }
     return null;
    }
}