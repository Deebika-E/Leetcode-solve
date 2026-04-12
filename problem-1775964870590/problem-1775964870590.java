// Last updated: 4/12/2026, 9:04:30 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3  
4        int temp[]=new int[matrix.length];
5        for(int i=0;i<matrix.length;i++){
6            int sum1=0;
7            for(int j=0;j<matrix.length;j++){
8                if(matrix[i][j]==1){
9                   sum1++;
10                }
11            }
12            temp[i]=sum1;
13        }
14        return temp;
15    }
16}