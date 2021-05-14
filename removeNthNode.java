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
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        //gap creation
        while(count < n){
                fast = fast.next;
                count++;
            }
        //traversing until the last node
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        //removing the nth node 
        slow.next = slow.next.next; 
        return dummy.next;
        
    }
}