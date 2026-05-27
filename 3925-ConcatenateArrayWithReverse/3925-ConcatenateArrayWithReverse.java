// Last updated: 5/27/2026, 8:05:34 AM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3
4        int n = nums.length;
5        int[] ans = new int[2 * n];
6
7        for (int i = 0; i < n; i++) {
8            ans[i] = nums[i];
9        }
10
11        int idx = n;
12        for (int i = n - 1; i >= 0; i--) {
13            ans[idx++] = nums[i];
14        }
15
16        return ans;
17    }
18}