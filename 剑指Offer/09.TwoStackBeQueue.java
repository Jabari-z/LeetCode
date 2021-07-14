import java.util.Stack;

class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public CQueue() {
        s1= new Stack<>();
        s2= new Stack<>();
    }
    
    public void appendTail(int value) {
        s1.push(value);
    }
    
    public int deleteHead() {
        int val;
        if(s2.empty()){
            // s2为空 把s1的元素都移到s2
            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }

        val = s2.pop();       
        return val;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */