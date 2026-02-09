// Last updated: 2/9/2026, 7:26:33 PM
1class Solution {
2    public void moveZeroes(int[] nums) {  
3        int index=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]!=0){
6                nums[index]=nums[i];
7                index++;
8
9            }
10        }
11
12        while(index<nums.length){
13            nums[index]=0;
14            index++;
15        }
16        
17    }
18}