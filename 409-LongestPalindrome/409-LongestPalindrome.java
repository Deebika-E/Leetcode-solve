// Last updated: 2/11/2026, 10:14:31 PM
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] freq = new int[128]; 
4
5     
6        for (int i = 0; i < s.length(); i++) {
7            freq[s.charAt(i)]++;
8        }
9
10        int length = 0;
11        boolean hasOdd = false;
12
13        for (int count : freq) {
14            if (count % 2 == 0) {
15                length += count;
16            } else {
17                length += count - 1;
18                hasOdd = true;
19            }
20        }
21
22        if (hasOdd) length += 1;
23
24        return length;
25    }
26}
27