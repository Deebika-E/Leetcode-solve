// Last updated: 6/5/2026, 7:27:52 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][]grid=new int[m][n];
4        for(int i=0;i<m;i++){
5            for(int j=0;j<n;j++){
6                if(i==0||j==0){
7                    grid[i][j]=1;
8
9                }else{
10                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
11
12                }
13            }
14        }
15       return grid[m-1][n-1]; 
16    }
17}