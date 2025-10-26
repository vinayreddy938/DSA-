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
        
        ListNode sentinalNode = new ListNode();
        sentinalNode.next = head;
        ListNode prev = sentinalNode; 
        int length = 0;
        ListNode current = head;
        while(current!=null){
            current = current.next;
            length++;
        }
        for(int i=0;i<(length-n);i++){
            prev = prev.next;
        }
       prev.next = prev.next.next;
    

        return sentinalNode.next;
        
    }
}