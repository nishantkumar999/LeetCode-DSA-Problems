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
    public ListNode partition(ListNode head, int x) {

        ListNode dl = new ListNode(-1);
        ListNode dg = new ListNode(-1);
        ListNode tl = dl;
        ListNode tg = dg;

        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                tl.next = curr;
                tl = tl.next;
                curr = curr.next;
            }
            else{
                tg.next = curr;
                tg = tg.next;
                curr = curr.next;
            }
        }

        tl.next = null;
        tg.next = null;
        tl.next = dg.next;
        return dl.next;
    }
}