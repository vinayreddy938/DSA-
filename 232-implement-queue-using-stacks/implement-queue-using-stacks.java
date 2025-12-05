class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
       this.s1 = new Stack<>();
       this.s2 = new Stack<>();

        
    }
    
    public void push(int x) {
        this.s1.push(x);
    }
    
    public int pop() {
        while (s1.size() > 1) {
        s2.push(s1.pop());
        }
        int number = s1.pop();

         while (!s2.isEmpty()) {
          s1.push(s2.pop());
        }
       return  number;
    }
    
    public int peek() {
      
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int number = s2.pop();
        s1.push(number);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return number;

        
    }
    
    public boolean empty() {
        return s1.size()==0;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */