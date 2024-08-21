class Solution {
    public int pivotInteger(int n) {
     int sum=(n*n+n)/2;
     int total=(int)Math.sqrt(sum);
     
     return total*total==sum?total:-1;
 }
}