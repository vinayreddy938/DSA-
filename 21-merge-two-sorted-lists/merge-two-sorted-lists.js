/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function(list1, list2) {
    let dummy = new ListNode();
    const head = dummy;
    let i = list1;
    let j= list2;
    while(i!=null && j!=null){
        if(i.val<j.val){ 
            dummy.next = i;
            i=i.next;
            
        }
        else if(i.val>j.val){
            dummy.next = j;
            j=j.next;
        }else{
            dummy.next = i;
            i= i.next;
            dummy = dummy.next;
            dummy.next = j;
            j=j.next;
        }
        dummy = dummy.next;
    }
    if (i !== null) dummy.next = i;
    if (j !== null) dummy.next = j;
    return head.next;
    
};