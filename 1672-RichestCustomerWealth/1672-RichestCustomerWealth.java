// Last updated: 5/21/2026, 7:32:45 PM
1class Solution {
2    public int maximumWealth(int[][] acc) {
3        int rich = 0;
4        for (int[] i : acc) {
5            int sum = 0;
6            for (int money : i) {
7                sum += money;
8            }
9            rich = Math.max(rich, sum);
10        }
11        return rich;
12
13    }
14}