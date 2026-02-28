// Last updated: 2/28/2026, 7:13:52 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4        int maxsum = nums[0];
5        int currentsum = 0;
6
7        for(int i=0;i< nums.length;i++){
8            currentsum+=nums[i];
9
10            if(currentsum>maxsum){
11                maxsum=currentsum;
12            }
13
14            if(currentsum<0){
15                currentsum = 0;
16            }
17        }
18
19        
20        return maxsum;
21        
22    }
23}