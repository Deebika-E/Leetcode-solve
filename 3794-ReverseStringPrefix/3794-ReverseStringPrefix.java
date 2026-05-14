// Last updated: 5/14/2026, 7:41:45 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3         char[] arr = s.toCharArray();
4        
5        for (int i = 0; i < k / 2; i++) {
6            char temp = arr[i];
7            arr[i] = arr[k - 1 - i];
8            arr[k - 1 - i] = temp;
9        }
10        
11        return new String(arr);
12    }
13}