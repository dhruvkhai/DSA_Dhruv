class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N < 0) {
            x = 1/x;
            N = -N;
        }
        double res = 1.00;
        double curr = x;
        if(n == 0) return 1.00;
        if(n == 1) return x;
        while(N > 0){
            if(N % 2 == 1) res *= curr;
            curr *= curr;
            N=N/2;
        }
        return res;
    }
}