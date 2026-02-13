// Last updated: 2/13/2026, 8:54:33 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3
4        HashSet<Integer> set = new HashSet<>();
5        HashSet<Integer> res = new HashSet<>();
6
7        for (int n : nums1) set.add(n);
8        for (int n : nums2)
9            if (set.contains(n)) res.add(n);
10
11        int[] ans = new int[res.size()];
12        int i = 0;
13        for (int n : res) ans[i++] = n;
14
15        return ans;
16    }
17}