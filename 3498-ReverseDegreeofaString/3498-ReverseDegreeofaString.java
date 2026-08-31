// Last updated: 8/31/2026, 7:57:47 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int n=s.length();
4        int sum=0;
5        for(int i=0;i<n;i++){
6            char ch =s.charAt(i);
7            sum+=(('z' - ch)+1)*(i+1);
8        }
9
10        return sum;
11    }
12}