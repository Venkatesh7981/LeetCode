class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length; //size of array.
        if(n > threshold) return -1;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
    int sum=0;
     int low=1;
     int high=maxi;
     while(low<=high){
        int mid=low+(high-low)/2;
        int time=0;
            for(int i: nums){
                time += (i + mid - 1) / mid;
            }
        if(time<=threshold){
            high=mid-1;
        }
        else low=mid+1;
     }
        return low;
    }
}