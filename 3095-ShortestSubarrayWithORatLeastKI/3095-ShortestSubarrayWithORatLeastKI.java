// Last updated: 3/17/2026, 7:10:25 PM
1class Solution {
2    public int minimumSubarrayLength(int[] nums, int k) {
3        int n=nums.length;
4        int ans=Integer.MAX_VALUE;
5        for(int i=0;i<n;i++){
6            int  sum=0;
7            for(int j=i;j<n;j++){
8                sum=sum|nums[j];
9                if(sum>=k){
10                     ans=Math.min(ans,(j-i+1));
11                     break;
12            }
13          }
14
15        }
16        return (ans==Integer.MAX_VALUE)?-1:ans;
17
18    } 
19}