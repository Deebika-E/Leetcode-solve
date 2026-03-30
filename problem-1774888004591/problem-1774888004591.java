// Last updated: 3/30/2026, 9:56:44 PM
1class Solution {
2    public boolean check(int[] nums) {
3        int n=nums.length;
4        int x=0;
5        for(int i=0;i<n;i++){
6            if(nums[i]>nums[(i+1)%n])
7                 x++;
8        }
9      return x<=1;
10    }
11}