// Last updated: 1/24/2026, 3:27:15 PM
class Solution {
    public void sortColors(int[] nums) {
     
     int start=0,end=nums.length-1,i=0;

     while(i<=end){
         if(nums[i] == 0){
            int t=nums[i];
            nums[i++] =nums[start];
            nums[start++]=t;
         }

         else if(nums[i] == 1) ++i;

         else{
            int t=nums[i];
            nums[i] = nums[end];
            nums[end--]=t;
          }  

     }

        
    }
}