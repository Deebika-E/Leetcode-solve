// Last updated: 2/19/2026, 8:50:46 PM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        
4        int prevCount = 0;    
5        int currCount = 1;    
6        int result = 0;
7        
8        for (int i = 1; i < s.length(); i++) {
9            
10            if (s.charAt(i) == s.charAt(i - 1)) {
11            
12                currCount++;
13            } 
14            else {
15               
16                if (prevCount < currCount) {
17                    result += prevCount;
18                } else {
19                    result += currCount;
20                }
21                
22            
23                prevCount = currCount;
24                currCount = 1;
25            }
26        }
27        
28
29        if (prevCount < currCount) {
30            result += prevCount;
31        } else {
32            result += currCount;
33        }
34        
35        return result;
36    }
37}
38