// Last updated: 10/7/2026, 6:31:51 PM
1class Solution {
2    public int maxProduct(int n) {
3        int first=0;
4        int second=0;
5
6        while(n!=0){
7            int temp=n%10;
8            if(temp>=first){
9                second=first;
10                first=temp;
11            }else if(temp>second){
12                second=temp;
13            }
14        
15            n/=10;
16        } 
17
18        return first*second;
19    }
20}