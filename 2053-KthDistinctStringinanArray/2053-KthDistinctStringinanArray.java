// Last updated: 2/23/2026, 1:01:00 PM
1class Solution {
2    public String kthDistinct(String[] arr, int k) {
3        HashMap<String, Integer> map = new HashMap<>();
4     
5        for (String s : arr) {
6            map.put(s, map.getOrDefault(s, 0) + 1);
7        }
8      
9        int count = 0;
10        for (String s : arr) {
11            if (map.get(s) == 1) {
12                count++;
13                if (count == k) {
14                    return s;
15                }
16            }
17        }
18        
19        return "";
20    }
21}