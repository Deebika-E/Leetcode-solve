// Last updated: 4/29/2026, 7:03:43 PM
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3       
4        int temp[]=new int[nums.length];
5        for(int i=0;i<nums.length;i++){
6            int count=0;
7            for(int j=0;j<nums.length;j++){
8                if(nums[j]<nums[i]){
9                    count++;
10                }
11            }
12            temp[i]=count++;
13        }
14        return temp;
15    }
16}