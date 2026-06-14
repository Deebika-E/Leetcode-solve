// Last updated: 6/14/2026, 8:56:08 AM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int sum=0;
4        int square=0;
5        while(n>0){
6            int digit=n%10;
7            sum+=digit;
8            square+=digit*digit;
9            n/=10;
10            
11        }
12        return (square-sum)>=50;
13    }
14}