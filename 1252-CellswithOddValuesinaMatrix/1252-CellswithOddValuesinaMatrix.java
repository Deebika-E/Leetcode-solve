// Last updated: 10/31/2026, 9:16:02 PM
1class Solution {
2    public int oddCells(int m, int n, int[][] indices) {
3        int ans[][]=new int[m][n];
4        int k=indices.length;
5
6        for(int i=0;i<k;i++){
7            for(int j=0;j<n;j++){
8                ans[indices[i][0]][j]++;
9            }
10            for(int j=0;j<m;j++){
11                ans[j][indices[i][1]]++;
12            }
13        }
14
15        int count=0;
16        for(int i=0;i<m;i++){
17            for(int j=0;j<n;j++){
18                if(ans[i][j]%2!=0){
19                    count++;
20                }
21            }
22        }
23
24        return count;
25    }
26}