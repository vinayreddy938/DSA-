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
 /*
 5/2 = 2
 */
class Solution {
    public ListNode middleNode(ListNode head) {
       ArrayList<ListNode> list = new ArrayList<>();
        ListNode current = head;
        
        while(current !=null){
            list.add(current);
            current = current.next;
        }
        int n= list.size();
        int mid = n/2;
        return list.get(mid);
      

        
    }
}