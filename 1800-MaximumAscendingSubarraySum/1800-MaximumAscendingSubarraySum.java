// Last updated: 2/28/2026, 7:27:21 PM
1class Solution {
2    public int maxAscendingSum(int[] nums) {
3     
4        
5        int currentsum =nums[0] ;
6        
7        int maxsum =currentsum;
8
9        for(int i=1;i< nums.length;i++){
10            if(nums[i]>nums[i-1]){
11                 currentsum+=nums[i];
12            }else{
13                currentsum=nums[i];            
14            
15             }  
16
17            maxsum=Math.max(maxsum,currentsum);
18          }
19        
20        return maxsum;
21      }
22 }
23 
24 