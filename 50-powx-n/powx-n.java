class Solution {
    public double myPow(double x, int n) {
      long num = n;

      if(num < 0){
        return (1 / result(x, -1*num));
      } 

      return result(x,num);
    }
    public static double result(double x, long num){
          if(num == 0) return 1.0;
          if(num == 1) return x;

          if(num % 2 == 0) return result(x * x, num /2);

          return x * result(x, num - 1); 
    }
}