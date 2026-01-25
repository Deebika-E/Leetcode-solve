// Last updated: 1/25/2026, 10:28:27 AM
1class Solution {
2    public int mySqrt(int x) {
3        if(x<2)  return x;
4        int left=0;
5        int right=x/2;
6        int ans=0;
7        while(left<=right){
8            int mid=(left+right)/2;
9
10            if((long)mid*mid<=x){
11                ans=mid;
12                left=mid+1;
13            }else{
14                right=mid-1;
15            }
16
17
18        }
19        return ans;
20        
21    }
22}