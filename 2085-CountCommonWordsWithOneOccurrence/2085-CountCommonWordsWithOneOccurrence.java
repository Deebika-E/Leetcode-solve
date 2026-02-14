// Last updated: 2/14/2026, 9:35:41 PM
1class Solution {
2    public int countWords(String[] words1, String[] words2) {
3        Map<String, Integer> map1 = new HashMap<>();
4        Map<String, Integer> map2 = new HashMap<>();
5    
6        for (String w : words1) {
7            map1.put(w, map1.getOrDefault(w, 0) + 1);
8        }
9        
10        for (String w : words2) {
11            map2.put(w, map2.getOrDefault(w, 0) + 1);
12        }
13        
14        int count = 0;
15      
16        for (String w : map1.keySet()) {
17            if (map1.get(w) == 1 && map2.getOrDefault(w, 0) == 1) {
18                count++;
19            }
20        }
21        
22        return count;
23    }
24}
25