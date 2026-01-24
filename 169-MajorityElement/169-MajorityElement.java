// Last updated: 1/24/2026, 3:27:07 PM
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate = 0;
        

        for(int num:nums ){
            if(count==0){
                candidate=num;
            }

            count+=(num==candidate)?1:-1;
        }
      return candidate;

        
    }
}