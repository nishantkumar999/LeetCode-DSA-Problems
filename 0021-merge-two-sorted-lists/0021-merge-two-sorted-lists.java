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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode ansHead = dummy;

        while(list1 != null && list2 != null){

            //compare of both listNode data to add ansHead
            if(list1.val <= list2.val){
                ansHead.next = list1;
                list1 = list1.next;
            }
            else{
                ansHead.next = list2;
                list2 = list2.next;
            }
            ansHead = ansHead.next;

        }

        if(list1 != null){
                ansHead.next = list1;
        }
        if(list2 != null){
                ansHead.next = list2;
        } 
        return dummy.next;
    }
}