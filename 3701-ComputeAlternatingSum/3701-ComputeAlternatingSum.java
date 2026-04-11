// Last updated: 4/11/2026, 9:31:57 PM
1class Solution {
2    public int alternatingSum(int[] nums) {
3        int sum=nums[0];
4        for(int i=1;i<nums.length;i++){
5            if(i%2==0){
6                sum+=nums[i];
7            }else{
8                sum-=nums[i];
9            }
10        }
11        return sum;
12    }
13}