class StockSpanner {
    Stack<int[]> st;  // each element is {price, span}

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;  // at least 1 day (today itself)

        // Pop all previous smaller/equal prices and add their spans
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }

        st.push(new int[]{price, span});
        return span;
    }
}
