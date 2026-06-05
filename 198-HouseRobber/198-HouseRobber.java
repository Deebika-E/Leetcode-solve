// Last updated: 6/5/2026, 7:29:57 PM
1class Solution {
2    public int rob(int[] nums) {
3        int a=0,b=0,max=0;
4        for(int arr:nums){
5            max=Math.max(a,b+arr);
6            b=a;
7            a=max;
8        }
9
10        return max;
11    }
12}