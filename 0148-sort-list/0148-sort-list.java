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
    
    public ListNode sortList(ListNode head) {
        //base case
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        //we have to find mid of this whole linked list
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        //now we have to call mergesort
        ListNode leftSort =  sortList(head);
        ListNode rightSort = sortList(slow);
        ListNode ans  = mergeSortedList(leftSort, rightSort);

        return ans; 
    
    }

    public ListNode mergeSortedList(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(-1);
        ListNode Head = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                Head.next = l1;
                l1 = l1.next;
            }
            else{
                Head.next = l2;
                l2 = l2.next;
            }
            Head = Head.next;
        }

        if(l1 != null){
            Head.next = l1;
        }
        if(l2 != null){
            Head.next = l2;
        }

        return dummy.next;
    }
   
    

     
        
}