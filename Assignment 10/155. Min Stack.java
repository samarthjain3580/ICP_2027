// TC: O(N)
// SC: O(1)


class MinStack {

    private Stack stack;

    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        if (stack.isEmpty()) return -1;
        else return (int) stack.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<stack.size(); i++) {
            if ((int) stack.get(i) < min) {
                min = (int) stack.get(i);
            }            
        }

        return min;

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
