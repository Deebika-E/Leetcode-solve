// Last updated: 1/25/2026, 10:21:28 AM
1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        
4        Arrays.sort(nums);
5        if(k==1) return 0;
6        int mindiff=Integer.MAX_VALUE;
7        for(int i=0;i+k-1<nums.length;i++){
8            int diff=nums[i+k-1]-nums[i];
9             mindiff=Math.min(mindiff,diff);
10        }
11
12        return mindiff;
13    }
14}