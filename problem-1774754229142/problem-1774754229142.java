// Last updated: 3/29/2026, 8:47:09 AM
1class Solution {
2    public int firstMatchingIndex(String s) {
3      int n=s.length();
4      int result=-1;
5        for(int i=0;i<n;i++){
6            if(s.charAt(i)==s.charAt(n-i-1)){
7                result=i;
8                break;
9            }
10        }
11
12        return result;
13    }
14}
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32