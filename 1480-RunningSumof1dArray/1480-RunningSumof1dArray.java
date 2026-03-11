// Last updated: 3/11/2026, 9:43:40 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        for(int i=1;i<nums.length;i++){
4            nums[i]=nums[i-1]+nums[i];
5        }
6      return nums;
7    }
8}