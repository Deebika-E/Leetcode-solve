// Last updated: 10/9/2026, 9:26:38 PM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            
5                int sum=0;
6                int n=nums[i];
7                while(n!=0){
8                    int digit=n%10;
9                    sum+=digit;
10                    n/=10;
11                    
12                }
13                if(sum==i){
14                    return i;
15                }
16            }
17        
18
19        return -1;
20    }
21}