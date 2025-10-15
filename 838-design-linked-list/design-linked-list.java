class Node {
    int value ;
    Node next;
    Node(int value){
        this.value = value;
        this.next = null;
    }
    
}


class MyLinkedList {
    Node head;
    int size ;
    public MyLinkedList() {
       head = null;
       size = 0;
        
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node  current = this.head;
        for(int i=0;i<index;i++){
            current = current.next;
        }
        return current.value;

        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head; 
        this.head = newNode;
        this.size++;


        
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(this.head == null){
            this.head = newNode;
            size++;
            return;
        }
        Node current = this.head;
        while(current.next!=null){
            current = current.next;

        }
        //   newNode.next =  current.next; this will alrwady nu;; wy we do that unnecessary
        current.next = newNode;
        this.size++;
      
       
        
    }
    
    public void addAtIndex(int index, int val) {
        //       head-> 3->4->5
        //indexes       0->1->2 addAtIndex(2,3) 3->4->3->5
         if(index<0 || index>size){
            return ;
        } 
        if(index == size){
            addAtTail(val);
           
            return;
        }
        if(index == 0){
            addAtHead(val);

          return;
         }

        Node newNode = new Node(val);
        Node  current = this.head;
        for(int i=0;i<index-1;i++){
            current= current.next;

        }
        newNode.next = current.next;
        current.next = newNode;
        this.size++;

        
        
        
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index >=this.size){
            return;

        }
        Node  current = this.head;
           if(index == 0){
              head = head.next;  // head-> 3-> 5 deleete(0) current = 3 /current.next = current.next.next
               size--;
             return;
            }
        for(int i=0;i<index-1;i++){
            current= current.next;

        }
         current.next  = current.next.next;
         size--;

        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */