// Last updated: 2/14/2026, 9:57:06 PM
1import java.util.*;
2
3class Solution {
4    public String[] uncommonFromSentences(String s1, String s2) {
5        Map<String, Integer> freq = new HashMap<>();
6        
7    
8        String[] words1 = s1.split(" ");
9        String[] words2 = s2.split(" ");
10     
11        for (String w : words1) {
12            freq.put(w, freq.getOrDefault(w, 0) + 1);
13        }
14        
15       
16        for (String w : words2) {
17            freq.put(w, freq.getOrDefault(w, 0) + 1);
18        }
19        
20      
21        List<String> result = new ArrayList<>();
22        for (String w : freq.keySet()) {
23            if (freq.get(w) == 1) {
24                result.add(w);
25            }
26        }
27        
28        return result.toArray(new String[0]);
29    }
30}
31