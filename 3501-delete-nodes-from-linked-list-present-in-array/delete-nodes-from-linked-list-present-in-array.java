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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
ListNode sentinalNode = new ListNode(0);
sentinalNode.next = head;  
HashSet<Integer> hset = new HashSet<>();
 
for(int i=0;i<nums.length;i++){
    hset.add(nums[i]);
}
        
        ListNode prev = sentinalNode;
        while(prev!=null && prev.next!=null){ 
            int value = prev.next.val;
            if(hset.contains(value)){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }
  

    
      return sentinalNode.next;
        
    }
}