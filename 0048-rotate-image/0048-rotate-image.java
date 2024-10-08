class Solution {
    private void transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
             int temp=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=temp;
            }
        }
    }
    private void reverse(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            int left=0;
            int right=matrix.length-1;
            while(left< right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
    public void rotate(int [][] matrix){
        transpose(matrix);
        reverse(matrix);
    }
}