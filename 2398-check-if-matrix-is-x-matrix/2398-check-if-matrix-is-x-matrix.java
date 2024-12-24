class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int length = grid.length;
        for(int i = 0; i < length; i++)
            for(int j = 0; j < length; j++)
                if(i == j){
                    if(grid[i][j] == 0)
                        return false;
                    }
                else if(i == length - 1 - j){
                    if(grid[i][j] == 0)
                        return false;
                        }
                else if(grid[i][j] != 0)
                    return false;
        return true;
    }
}