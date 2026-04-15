// Last updated: 4/15/2026, 9:10:04 PM
1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3         int n = words.length;
4        int minDistance = Integer.MAX_VALUE;
5
6        for (int i = 0; i < n; i++) {
7            if (words[i].equals(target)) {
8
9                int direct = Math.abs(i - startIndex);
10                int circular = n - direct;
11
12                int distance = Math.min(direct, circular);
13                minDistance = Math.min(minDistance, distance);
14            }
15        }
16
17        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
18    
19    }
20}