public class Solution {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int []>list=new LinkedList<>();
        if(matrix==null||matrix.length==0||matrix[0].length==0)
        	return list;
        int m=matrix.length;
        int n=matrix[0].length;
        boolean [][]pacific=new boolean[m][n];
        boolean [][]atlantic=new boolean[m][n];
        for(int i=0;i<m;i++){
        	dfs(matrix,pacific,Integer.MIN_VALUE,i,0);
        	dfs(matrix,atlantic,Integer.MIN_VALUE,i,n-1);
        }
        for(int j=0;j<n;j++){
        	dfs(matrix,pacific,Integer.MIN_VALUE,0,j);
        	dfs(matrix,atlantic,Integer.MIN_VALUE,m-1,j);
        }
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(pacific[i][j]&&atlantic[i][j]){
        			list.add(new int[]{i,j});
        		}
        	}
        }
        return list;
       
        
    }
    int [][]d=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public void dfs(int[][] matrix,boolean [][]visited,int height,int x,int y){
    	int m=matrix.length;
        int n=matrix[0].length;
    	if(x<0||x>=m||y<0||y>=n||visited[x][y]||matrix[x][y]<height)
    		return ;
    	visited[x][y]=true;
    	for(int []i:d){
    	dfs(matrix,visited,matrix[x][y],x+i[0],y+i[1]);
    	}
    }
}