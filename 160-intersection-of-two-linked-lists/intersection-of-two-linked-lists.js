/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    let set = new Set();
     let currentA = headA;
        let currentB = headB;


     while(currentB!=null){
               set.add(currentB);
               currentB= currentB.next;
            }
            while(currentA!=null){
                if(set.has(currentA)){
                
                    return currentA;

                   
                }
                currentA = currentA.next;
            }

            return null;
    
};