// Last updated: 10/30/2026, 7:21:42 PM
1class Solution {
2    public int[] distributeCandies(int candies, int num_people) {
3        int ans[]=new int[num_people];
4        int sum=1;
5        while(candies>0){
6              
7            for(int i=0;i<num_people ;i++){
8                if(candies>=sum){
9                    ans[i]+=sum;
10                    candies-=sum;
11                    sum++;
12                }
13                else{
14                    ans[i]+=candies;
15                    candies=0;
16                }
17            }
18            
19        }
20
21        return ans;
22       
23    }
24}