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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         
        ListNode dummy = new ListNode(-1);
        ListNode fast = dummy;
        ListNode slow = dummy;
        dummy.next = head;

       //move fast pointer till n steps
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        //edge case 
        if(fast.next == null){
            head = head.next;
            return head;
        }
        
        //Now both fast and slow will move together
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}