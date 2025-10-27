/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function deleteDuplicates(head: ListNode | null): ListNode | null {
    if(head==null){
        return null;
    }
    let prev :ListNode = head;
    let current: ListNode = head.next;
    while(current!=null){
        if(current.val === prev.val){
            prev.next = prev.next.next;
        }else{
            prev = prev.next;
        }
        current = current.next;
    }
    return head;

    
};