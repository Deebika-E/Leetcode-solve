// Last updated: 2/2/2026, 7:59:49 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0, right = s.length() - 1;
4
5        while (left < right) {
6            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
7                left++;
8            }
9            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
10                right--;
11            }
12
13            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
14                return false;
15            }
16
17            left++;
18            right--;
19        }
20        return true;
21    }
22}
23