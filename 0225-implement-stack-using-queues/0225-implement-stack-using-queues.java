class MyStack {

    Queue<Integer> q = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
       int s = q.size();
       q.offer(x);

       for(int i = 0; i < s ; i++){
        q.offer(q.poll());
       }
    }

    public int pop() {
      return q.isEmpty() ? -1 : q.poll();
    }

    public int top() {
        return q.isEmpty() ? -1 : q.peek();
    }

    public boolean empty() {
        return q.size() == 0;
    }
}
