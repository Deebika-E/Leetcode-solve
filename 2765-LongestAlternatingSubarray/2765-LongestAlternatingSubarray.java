// Last updated: 2/28/2026, 7:01:36 PM
1class Solution {
2    public int alternatingSubarray(int[] nums) {
3        int max = -1, cnt = -1, j;
4        if(nums.length == 2 && nums[1] - nums[0] == 1)  return 2;
5        for(int i=2; i<=nums.length; i++){
6            if(i == nums.length && nums[i-1] - nums[i-2] == 1){
7                max = Math.max(max,2);
8                break;
9            }
10            if(nums[i-1] - nums[i-2] == 1){
11                cnt = 2;
12                j = i;
13                while(j < nums.length && nums[j] == nums[j-2]){
14                    j++;
15                    cnt++;
16                }
17                max = Math.max(max,cnt);
18            }
19        }
20        return max;
21    }
22}