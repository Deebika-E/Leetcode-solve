// Last updated: 5/31/2026, 8:59:59 AM
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int ans=0;
4        while(n>0){
5            ans+=n%10;
6            n/=10;
7        }
8
9        return ans;
10    }
11}