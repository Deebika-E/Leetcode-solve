// Last updated: 9/10/2026, 9:11:59 PM
1class Solution {
2    public int scoreOfString(String s) {
3  
4        int tsum=0;
5        for(int i=0;i<s.length()-1;i++){
6           tsum+=Math.abs(s.charAt(i) - s.charAt(i+1));
7        }
8        return tsum;
9    }
10}