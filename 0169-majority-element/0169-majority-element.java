class Solution {
    public int majorityElement(int[] arr) {
      int count=0;
      int cand=-1;
      for(int i=0;i<arr.length;i++){
        if(count==0){
            cand=arr[i];
        }
        if (cand==arr[i]) count++;
         else count--;
      }  
      count=0;
      for(int i=0;i<arr.length;i++){
        if(cand==arr[i]){
            count++;
        }
      }
      if(count>arr.length/2) return cand;
      else return -1;
    }
}