// Last updated: 3/22/2026, 9:31:54 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        int n = s.length();
4        StringBuilder sb = new StringBuilder();
5        int count = 0;
6        for (int i = n - 1; i >= 0; i--) {
7            if (Character.isLetterOrDigit(s.charAt(i))) {
8                if (count == k) {
9                    sb.append('-');
10                    count = 0;
11                }
12                sb.append(Character.toUpperCase(s.charAt(i)));
13                count++;
14            }
15        }
16        return sb.reverse().toString();
17    }
18}