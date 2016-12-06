public class Solution {
    public int islandPerimeter(int[][] grid) {
        int width=grid.length;
        int count=0;
        int repeat=0;
        for(int i=0;i<width;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    count++;
                if(i<width-1&&grid[i+1][j]==1)repeat++;
                if(j<grid[i].length-1&&grid[i][j+1]==1)repeat++;
                }
                
            }
        }
        return 4*count-2*repeat;
    }
}