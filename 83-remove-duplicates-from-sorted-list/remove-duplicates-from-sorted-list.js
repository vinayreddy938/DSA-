/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    if(head==null){
        return null;
    }
    prev = head;
    let current =  head.next;
    while(current!=null){
        if(prev.val == current.val){
            prev.next = prev.next.next;
        }
        else{
            prev = prev.next;
        }
        current = current.next;

        
        
    }
    return head;
    
};