// Last updated: 4/11/2026, 10:07:04 PM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int leftsum=0;
4        int rightsum=0;
5        int answer[]=new int[nums.length];
6        for(int i=0;i<nums.length;i++){
7          
8            rightsum+=nums[i];   
9        }
10        for(int i=0;i<nums.length;i++){
11            leftsum+=nums[i];
12            answer[i]=Math.abs(rightsum-leftsum);
13            rightsum-=nums[i];
14        }
15       return answer;
16    }
17}