/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        HashSet<ListNode> seenNodes = new HashSet<>();
        while(current!=null){
            if(seenNodes.contains(current)){
                return true;
            }
            seenNodes.add(current);
            current= current.next;
        }
        return false;
         
    }
}