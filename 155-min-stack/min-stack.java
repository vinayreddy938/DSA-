class MinStack {
       Stack<ArrayList<Integer>> stack ;

    public MinStack() { 
             stack = new Stack();
        
    }
    
    public void push(int val) {
        if(this.stack.size()==0){
            ArrayList<Integer> pair = new ArrayList<>(List.of(val, val));
            this.stack.push(pair);
        }else{
            int min = Math.min(this.stack.peek().get(1),val);
            ArrayList<Integer> pair = new ArrayList<>(List.of(val, min));
            this.stack.push(pair);
        }
        
    }
    
    public void pop() {
        this.stack.pop();
        
    }
    
    public int top() {
        return this.stack.peek().get(0);
        
    }
    
    public int getMin() {
        return this.stack.peek().get(1);
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */