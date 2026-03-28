// Last updated: 3/28/2026, 3:19:26 PM
1class Solution {
2    public int subsetXORSum(int[] nums) {
3        int n = nums.length;
4        int orAll = 0;
5        for (int num : nums) {
6            orAll |= num; 
7        }
8        return orAll * (1 << (n - 1));
9    }
10}