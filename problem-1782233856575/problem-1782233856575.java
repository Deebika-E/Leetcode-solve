// Last updated: 6/23/2026, 10:27:36 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3       if (strs.length == 0) return "";
4         String prefix = strs[0];
5         for (int i = 1; i < strs.length; i++) {
6             while (!strs[i].startsWith(prefix)) {
7                prefix = prefix.substring(0, prefix.length()- 1);
8                   if (prefix.isEmpty()) return "";
9              }
10             }
11          return prefix;
12    }
13}