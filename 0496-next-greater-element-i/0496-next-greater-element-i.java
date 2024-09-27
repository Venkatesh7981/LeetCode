class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        int found=0;
        Arrays.fill(ans,-1);
        for(int i=0;i<nums1.length;i++){
            found=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) found=1;
                  if(nums2[j]>nums1[i] && found==1){
                 ans[i]=nums2[j];
                 break;
                  }   
            }
        }
        return ans;
    }
}