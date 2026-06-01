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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
    return head;
}
        int length = 0;
        ListNode current = head;
        while(current!=null){
            length++;
            current=current.next;
        }
        k = k % length;

        if (k == 0) {
            return head;
        }
        ListNode pointer = head;
        for(int i=0;i<length-k-1;i++){
            pointer=pointer.next;
            
        }
        ListNode newHead=pointer.next;
        pointer.next=null;
         ListNode tail=newHead;
         while(tail.next!=null){
            tail=tail.next;
         }
         tail.next=head;
        
        return newHead;
        
    }
}