/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hset = new HashSet<>();
        ListNode currentA = headA;
        while(currentA!=null){
            hset.add(currentA);
            currentA = currentA.next;
        }
        ListNode currentB = headB;
        while(currentB!=null){
            if(hset.contains(currentB)){
                return currentB;
            }
            currentB=currentB.next;
        }
        return null;
        
    }
}