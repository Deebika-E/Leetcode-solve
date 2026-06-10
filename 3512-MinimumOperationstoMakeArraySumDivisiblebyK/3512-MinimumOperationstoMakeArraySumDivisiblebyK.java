// Last updated: 6/10/2026, 8:05:59 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3       int sum=0;
4       for(int i=0;i<nums.length;i++){
5          sum+=nums[i];
6       } 
7       int num=sum%k;
8       return num;
9    }
10}