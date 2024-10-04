/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//  import java.util.*;
   public class Solution {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashSet<ListNode> map=new HashSet<>();
//         ListNode temp1=headA;
//         ListNode temp2=headB;
//         if(headA==null) return null;
//         while(temp1!=null){
//             map.add(temp1);
//             temp1=temp1.next;
//         }
//         while(temp2!=null){
//             if(map.contains(temp2)) return temp2;
//             temp2=temp2.next;
//         }
//         return null;
 ListNode d1 = headA;
    ListNode d2 = headB;
    
    while(d1 != d2) {
        d1 = d1 == null? headA:d1.next;
        d2 = d2 == null? headB:d2.next;
    }
    
    return d1;
    }
}