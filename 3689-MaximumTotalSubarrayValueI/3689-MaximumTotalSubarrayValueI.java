// Last updated: 6/9/2026, 6:58:19 PM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        int max=nums[0];
4        int min=nums[0];
5        for(int i:nums){
6            max=Math.max(max,i);
7            min=Math.min(min,i);
8        }
9        return (long)(max-min)*k;
10    }
11}