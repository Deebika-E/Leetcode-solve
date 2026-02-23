// Last updated: 2/23/2026, 12:50:25 PM
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String doubled = s + s;
4        String trimmed = doubled.substring(1, doubled.length() - 1);
5        return trimmed.contains(s);
6    }
7}