class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int r=matrix.length;
        int c=matrix[0].length;
        int e=(r*c)-1;
        while(s<=e){
            int mid=(s+e)/2;
            int row=mid/c;
            int col=mid%c;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return false;
    }
}