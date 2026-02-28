// Last updated: 2/28/2026, 7:07:05 PM
1class Solution {
2    public int alternatingSubarray(int[] nums) {
3        int n = nums.length;
4        int max = -1;
5        int len = 1;
6        int expected = 1;  
7
8        for (int i = 1; i < n; i++) {
9            int diff = nums[i] - nums[i - 1];
10
11            if (diff == expected) {
12                len++;
13                expected *= -1;  
14                max = Math.max(max, len);
15            } else {
16              
17                if (diff == 1) {
18                    len = 2;
19                    expected = -1;
20                    max = Math.max(max, len);
21                } else {
22                    len = 1;
23                    expected = 1;
24                }
25            }
26        }
27
28        return max;
29    }
30}