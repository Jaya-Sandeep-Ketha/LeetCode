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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head; 
        ListNode current = head;
        ListNode previous = dummy;
        while(current!=null && current.next!=null){
            if(current.next!=null && current.val == current.next.val){
                while(current.next!=null && current.val == current.next.val){
                    current = current.next;
                }
                previous.next = current.next;
            }
            else{
                previous = previous.next;
            }
            current = current.next;
        }
        return dummy.next;
    }
}