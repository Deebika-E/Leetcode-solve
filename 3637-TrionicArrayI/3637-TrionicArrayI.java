// Last updated: 2/3/2026, 9:57:34 PM
1class Solution {
2    public boolean isTrionic(int[] nums) {
3        int n = nums.length;
4        if (n < 3) return false;
5
6        int i = 1;
7
8        // 1️⃣ strictly increasing
9        while (i < n && nums[i] > nums[i - 1]) {
10            i++;
11        }
12        int p = i - 1;
13        if (p == 0) return false; // no increasing part
14
15        // 2️⃣ strictly decreasing
16        while (i < n && nums[i] < nums[i - 1]) {
17            i++;
18        }
19        int q = i - 1;
20        if (q == p) return false; // no decreasing part
21
22        // 3️⃣ strictly increasing again
23        while (i < n && nums[i] > nums[i - 1]) {
24            i++;
25        }
26
27        // ✅ ensure third segment exists and reaches end
28        return i == n && q < n - 1;
29    }
30}
31