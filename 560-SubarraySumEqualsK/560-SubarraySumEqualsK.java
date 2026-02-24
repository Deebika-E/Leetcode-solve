// Last updated: 2/24/2026, 9:55:22 AM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int count=0;
4
5        for(int i=0;i<nums.length;i++){
6            int sum=0;
7            for(int j=i;j<nums.length;j++){
8                sum+=nums[j];
9                if(sum==k){
10                    count++;
11
12                }
13            }
14        }
15        return count;
16        
17    }
18}