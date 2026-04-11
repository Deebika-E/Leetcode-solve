// Last updated: 4/11/2026, 9:38:30 PM
1class Solution {
2    public int minimumOperations(int[] nums) {
3        int ops=0;
4
5        for(int x:nums){
6            if(x%3!=0)
7               ops++;
8        }
9       return ops; 
10    }
11}