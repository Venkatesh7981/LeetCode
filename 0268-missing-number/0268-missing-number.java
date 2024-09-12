class Solution {
    public int missingNumber(int[] nums) {
        // int count=0;
        // Arrays.sort(nums);
        // if(nums[0]!=0) return 0;
        // if(nums[nums.length-1]!=nums.length) return nums.length;
        // for(int i=0;i<nums.length;i++){
            
        //     if(nums[i]!=i)
        //     return i;
        // }
        // return 0;
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int num:nums){
            sum-=num;
        }
        return sum;
    }
}