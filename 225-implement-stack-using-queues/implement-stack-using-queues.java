import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int size = q1.size();
        
        for (int i = 0; i < size - 1; i++) {
            q2.add(q1.poll());
        }
        
        int item = q1.poll();   // last element (stack top)
        
        // swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return item;
    }
    
    public int top() {
        int size = q1.size();
        
        for (int i = 0; i < size - 1; i++) {
            q2.add(q1.poll());
        }
        
        int item = q1.poll();
        q2.add(item);          // keep the top element in the queue
        
        // swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return item;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
