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
        HashSet<ListNode> hset = new HashSet<>();
        ListNode current = head;
        while(current!=null){
            if(hset.contains(current)){
                return true;
            }
            hset.add(current);
            current= current.next;
        }
        return false;
    }
}