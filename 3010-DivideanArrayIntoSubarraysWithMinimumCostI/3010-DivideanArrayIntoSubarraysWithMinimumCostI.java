// Last updated: 2/1/2026, 2:12:46 PM
1class Solution {
2    public int minimumCost(int[] nums) {
3        int first=nums[0];
4        int min1=Integer.MAX_VALUE;
5        int min2=Integer.MAX_VALUE;
6
7        for(int i=1;i<nums.length;i++){
8            if(nums[i]<min1){
9                min2=min1;
10                min1=nums[i];
11            }else if(nums[i]<min2){
12                min2=nums[i];
13
14            }
15        }
16
17        return first+min1+min2;
18        
19    }
20}