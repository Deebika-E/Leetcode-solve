// Last updated: 3/2/2026, 9:06:30 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int n=nums.length;
4        long sum=0;
5        for(int i=0;i<k;i++){
6            sum+=nums[i];
7        }
8        long maxsum=sum;
9        for(int i=k;i<n;i++){
10            sum=sum-nums[i-k]+nums[i];
11            maxsum=Math.max(maxsum,sum);
12        }
13      return (double)maxsum/k;
14    }
15}