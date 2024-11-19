class Solution {
    public void nextPermutation(int[] nums) {
        int ind1=-1;
       for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        if(ind1==-1){
           Arrays.sort(nums);
           return;
        }
       for(int i=nums.length-1;i>0;i--){
        if(nums[i]>nums[ind1]){
            int temp=nums[i];
            nums[i]=nums[ind1];
            nums[ind1]=temp;
            break;
        }
       }
       Arrays.sort(nums,ind1+1,nums.length);
    }
}