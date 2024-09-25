class Solution {
    public double myPow(double x, int n) {
      if(n==0 ) return 1.0;
      if(x==0.0) return 0.0;
      if(x==1.0) return 1.0;
      if(x==-1.0 && n%2==0) return 1.0;
      if(x==-1.0 && n%2!=0) return -1.0;
      long bif=n;
      double ans=1;
      if(n<0){
        x=1/x;
        bif=-bif;
      } 
      while(bif>0){
        if(bif%2==1){
            ans*=x;
        }
        x*=x;
        bif=bif/2;
      }
      return ans;
    }
}