class FreqStack {
    private Map<Integer,Integer> freqMap;
    private Map<Integer, Stack<Integer>> group;
    private int maxfreq;

    public FreqStack() {
        freqMap = new HashMap<>();
        group = new HashMap<>();
        maxfreq = 0;    
    }
    
    public void push(int val) {
        int f = freqMap.getOrDefault(val,0) + 1;
        freqMap.put(val , f);
        maxfreq = Math.max(maxfreq, f);

        group.computeIfAbsent(f,k -> new Stack<>()). push(val);
    }
    
    public int pop() {
        Stack<Integer> st = group.get(maxfreq);
        int val = st.pop();
        freqMap.put(val , freqMap.get(val) - 1);
        if (st.isEmpty()) maxfreq--;
        return val;
    }
}
