// Last updated: 4/4/2026, 8:48:26 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3       int n= nums.length;
4       int count=0;
5       int max=0;
6      
7       for(int i=0;i<n;i++){
8           if(nums[i]==1){
9            count++;
10            max=Math.max(max,count);
11           }else{
12            count=0;
13           }
14      
15        }
16        return max;
17    }
18}