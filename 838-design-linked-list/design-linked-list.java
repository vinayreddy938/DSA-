class Node{
    public int value;
    public Node next;
    public Node(int value){
        this.value = value;
        this.next = null;
    }

}

class MyLinkedList {
    public Node head;
    private int size;


    public MyLinkedList() {
        this.head = null;
    this.size = 0;
        
    }
    
    public int get(int index) {
        if(index<0 || index>=this.size){
            return -1;

        }
        Node currentNode = head;
        for(int i=0;i<index;i++){
            currentNode = currentNode.next;
        }
        return currentNode.value;
        
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next=this.head;
        this.head=node;
        this.size++;
        
    }
    
    public void addAtTail(int val) {
        if(this.head==null){
            addAtHead(val);
    
            return;
            

        }

        Node node= new Node(val);

        Node currentNode = this.head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
            currentNode.next = node;
        this.size++;


        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }

            if(index == 0){
        addAtHead(val);
        return;
    }


        Node node = new Node(val);
        Node currentNode = this.head;
        for(int i=0;i<index-1;i++){
            currentNode = currentNode.next;
            
        }
        node.next = currentNode.next;
        currentNode.next =node;
        this.size++;
        
    }
    
    public void deleteAtIndex(int index) {
          if(index<0 || index>=this.size){
            return;

        }
        if(index == 0){
          head = head.next;
        size--;
      return;
}
        Node currentNode = head;
        for(int i=0;i<index-1;i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        this.size--;

        
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