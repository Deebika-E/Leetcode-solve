// Last updated: 4/18/2026, 8:42:37 PM
1class Solution {
2    public int mirrorDistance(int n) {
3      int ori=n;
4      int rev=0;
5      int ans=0;
6      while(n!=0){
7          int digit=n%10;
8          rev=rev*10+digit;
9          n/=10;
10          
11      }  
12     
13     return Math.abs(ori-rev);
14    }
15}