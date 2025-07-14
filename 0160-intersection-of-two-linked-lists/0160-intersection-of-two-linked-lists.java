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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;

        // //edge case 
        // if(t1 == null )

        while(t1 != t2){

            //both pointers will move to end of list
            t1 = t1.next;
            t2 = t2.next;

            //when both pointers were moving to end of list check here for pointer at same node
            if(t1 == t2){
                return t1;
            }           
            
             //as list1 reaches to null point it to the list2 headB
            if(t1 == null){
                t1 = headB;
            }
             //as list2 reaches to null point it to the list1 headA
             if(t2 == null){
                t2 = headA;
             }
        }

        return t1;
    }
}