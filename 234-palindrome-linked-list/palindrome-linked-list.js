/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) { 
    let slow = head;
    let fast = head;
    while(fast && fast.next){
        slow = slow.next;
        fast = fast.next.next;

    }
    let prev = null;
    let current = slow;
    while(current!=null){
        let temp = current.next; 
        current.next = prev;
          prev = current;
        current = temp;
      
    } 
    let first = head;
    let second = prev;
    while(second){
        if(first.val!=second.val){
            return false;
        }
        first = first.next;
        second = second.next;
    }
    return true;


   

    
};