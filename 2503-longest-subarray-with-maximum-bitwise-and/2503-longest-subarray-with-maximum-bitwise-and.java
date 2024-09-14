class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
         int ans=0;
         int count=0;
        for(int num:nums){
           if(max==num){
            count++;
            ans=Math.max(count,ans);
           }
           else count=0;
        }
        return ans;
    }
}