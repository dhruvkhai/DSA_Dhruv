class MyQueue {
    private Stack<Integer> st1, st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
       while(!st1.isEmpty()){
        st2.push(st1.pop());
       }
       st1.push(x);
       while(!st2.isEmpty()) st1.push(st2.pop());
    }

    public int pop() {
      return st1.isEmpty() ? -1 : st1.pop();
    }

    public int peek() {
        return st1.isEmpty() ? -1 : st1.peek();
    }

    public boolean empty() {
        return st1.size() == 0;
    }
}
