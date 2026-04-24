// Last updated: 4/24/2026, 8:49:58 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int len = nums.length;
4        int[] ans = new int[len];
5        for (int i = 0; i < len; i++) {
6            if (i % 2 == 0) {
7              
8                ans[i] = nums[i / 2];
9            } else {
10                
11                ans[i] = nums[n + (i / 2)];
12            }
13        }
14        return ans;
15    }
16}