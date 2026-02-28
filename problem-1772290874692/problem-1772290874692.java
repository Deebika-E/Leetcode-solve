// Last updated: 2/28/2026, 8:31:14 PM
1import java.util.*;
2
3class Solution {
4    public int[] minDistinctFreqPair(int[] nums) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        // Count frequency
9        for (int num : nums) {
10            map.put(num, map.getOrDefault(num, 0) + 1);
11        }
12
13        List<Integer> unique = new ArrayList<>(map.keySet());
14        Collections.sort(unique);
15
16        for (int i = 0; i < unique.size(); i++) {
17            for (int j = i + 1; j < unique.size(); j++) {
18
19                int a = unique.get(i);
20                int b = unique.get(j);
21
22                if (!map.get(a).equals(map.get(b))) {
23                    return new int[]{a, b};
24                }
25            }
26        }
27
28        return new int[]{-1, -1};
29    }
30}