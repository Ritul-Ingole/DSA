// package recursion;

class Solution {
  public double power(double x, int n){
    if(n == 0 || x == 1.0) return 1;
    if(n < 0){
      x = 1/x;
      n = -n;
    }
    double half = power(x, n/2);
    if(n % 2 == 0){
      return half * half;
    } else {
      return half * half * x;
    }
  }
}

class mypow{
  public static void main(String[] args) {
      Solution obj = new Solution();
      System.out.println(obj.power(-2.00000, -2));
  }
}