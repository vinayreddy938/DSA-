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
        ListNode currentA = headA;
        ListNode currentB = headB;
        HashSet<ListNode> hmap = new HashSet<>();

        
            while(currentB!=null){
               hmap.add(currentB);
               currentB= currentB.next;
            }
            while(currentA!=null){
                if(hmap.contains(currentA)){
                
                    return currentA;

                   
                }
                currentA = currentA.next;
            }

            return null;
    
        
    }
}