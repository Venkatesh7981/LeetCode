class Solution {
    public int arrangeCoins(int n) {
      int i=1;
        while(n>0){
            i++;
            n-=i;
        }
        return i-1;
        // long start=1,end=n;
        // while(end>=start){
        //     long mid=(end+start)/2;
            
        }
    }
