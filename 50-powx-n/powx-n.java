class Solution {
    public double myPow(double x, int n) {
        // 1. Convert n to long to prevent overflow when negating Integer.MIN_VALUE
        long N = n;
        
        // 2. Handle negative exponents: x^(-n) = (1/x)^n
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1.0;
        double currentProduct = x;
        
        // 3. Binary Exponentiation loop
        while (N > 0) {
            // If N is odd, multiply the current step's product into our result
            if (N % 2 == 1) {
                result *= currentProduct;
            }
            // Square the base and halve the power
            currentProduct *= currentProduct;
            N /= 2;
        }
        
        return result;
    }
}