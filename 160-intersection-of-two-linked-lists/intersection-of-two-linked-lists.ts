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

function getIntersectionNode(headA: ListNode | null, headB: ListNode | null): ListNode | null {
    let a:ListNode= headA;
    let b:ListNode= headB;
    const set:Set<ListNode> = new Set();
    while(a!=null){
        set.add(a);
        a=a.next;

    }
    while(b!=null){
        if(set.has(b)){
            return b;
        }
        b= b.next;
    }
    return null;


};