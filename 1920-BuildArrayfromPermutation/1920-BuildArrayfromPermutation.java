// Last updated: 4/23/2026, 10:11:27 AM
1class Solution {
2    public int[] buildArray(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        
6        for(int i = 0; i < n; i++) {
7            ans[i] = nums[nums[i]];
8        }
9        
10        return ans;
11    }
12}