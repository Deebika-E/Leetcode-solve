// Last updated: 10/10/2026, 6:45:42 PM
1class Solution {
2    public int countCommas(int n) {
3        if(n<1000){
4            return 0;
5        }
6        else if(n>1000){
7           int count=0;
8           for(int i=1000;i<=n;i++){
9                 count++;
10           }
11           return count;
12        }else{
13            return 1;
14        }
15     
16    }
17}