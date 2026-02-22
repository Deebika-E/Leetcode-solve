// Last updated: 2/22/2026, 4:01:01 AM
1class Solution {
2    public int scoreDifference(int[] nums) {
3
4        int firsts=0;
5        int seconds=0;
6         boolean isfirstactive=true;
7
8        for(int i=0;i<nums.length;i++){
9            if(nums[i]%2!=0){
10               isfirstactive=!isfirstactive; 
11            }
12
13            if(i%6==5){
14               isfirstactive=!isfirstactive; 
15            }
16        
17
18      if(isfirstactive){
19          firsts+=nums[i];
20      }else{
21          seconds+=nums[i];
22      }
23     }
24
25        return firsts-seconds;
26        
27    }
28}