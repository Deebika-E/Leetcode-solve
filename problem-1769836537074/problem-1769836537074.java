// Last updated: 1/31/2026, 10:45:37 AM
1class Solution {
2    public int countElements(int[] nums) {
3        int min = Integer.MAX_VALUE;
4        int max = Integer.MIN_VALUE;
5
6
7        for (int num : nums) {
8            min = Math.min(min, num);
9            max = Math.max(max, num);
10        }
11
12        int count = 0;
13
14
15        for (int num : nums) {
16            if (num > min && num < max) {
17                count++;
18            }
19        }
20
21        return count;
22    }
23}
24
25        
26