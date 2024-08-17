class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int res=0;
        int leftmax=0,rightmax=0;
        while(left<=right){
            if(height[left]<=height[right]){
               if(leftmax<=height[left]) leftmax=height[left];
                
                else
                res+=leftmax-height[left];
                   left++;
               }
            else{
             if(rightmax<=height[right]) rightmax=height[right];
             
             else
             res+=rightmax-height[right];
             right--;

            }
        }
        return res;
    }
}